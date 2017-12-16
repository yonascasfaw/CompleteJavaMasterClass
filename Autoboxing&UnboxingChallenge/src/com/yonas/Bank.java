package com.yonas;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches = new ArrayList<Branch>();

//    public Bank(String branchLocation) {
//        addBranch(branchLocation);
//    }


    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public boolean addBranch(String location){
        if(findBranch(location)<0){
            Branch newBranch = new Branch(location);
            branches.add(newBranch);
            return true;
        }else
        return false;
    }

    public boolean addCustomer(String location, String customerName, Double transaction){
        if(findBranch(location)>=0){
            branches.get(findBranch(location)).addCustomer(customerName,transaction);
            return true;
        }else
            return false;
    }

    public boolean addTransaction(String location, String customerName, Double transaction){
        Branch thisBranch = new Branch(location);
        if(findBranch(location)>=0){
            if(thisBranch.findCustomer(customerName)>=0){
                branches.get(findBranch(location)).addTransaction(customerName,transaction);
                return true;
            }
        }
            return false;
    }

    public boolean listCustomers(String branchLocation){
        int position = findBranch(branchLocation);

        if(position >= 0){
            for(int i=0; i<=branches.get(position).getCustomers().size(); i++) {
                System.out.println(branches.get(position).searchCustomer(i) + ":");
                branches.get(position).listTransaction(branches.get(position).getCustomers().get(i));
                }
                return true;
            }
            return false;
        }


    public int findBranch(String location){
        for(int i=0; i<=branches.size(); i++){
            if(branches.get(i).getBranchLocation() == location){
                return i;   //the index(i) will be returned as being greater or equal to 0
            }
        }
        return -1;
    }

}
