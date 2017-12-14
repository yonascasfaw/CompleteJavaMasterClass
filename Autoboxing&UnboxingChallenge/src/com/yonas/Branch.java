package com.yonas;

import java.util.ArrayList;

public class Branch {
    private String branchLocation;
    ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchLocation){
        this.branchLocation = branchLocation;
    }

    public String getBranchLocation(){
        return branchLocation;
    }

    public boolean addCustomer(String name, Double initialTransaction){
        if(findCustomer(name)<0){
            Customer newCustomer = new Customer(name);
            newCustomer.addTransaction(initialTransaction);
            customers.add(newCustomer);
            return true;
        }else
            return false;
    }

    public boolean addTransaction(String name ,Double transaction){
        if(findCustomer(name)>=0){
            customers.get(findCustomer(name)).addTransaction(transaction);
            return true;
        }else
        return false;
    }


    public int findCustomer(String name){
        for(int i=0; i<=customers.size(); i++){
            if(customers.get(i).getCustomerName() == name){
                return i;
            }
        }
        return -1;
    }

    //    public boolean findCustomer(String name){
//        for(int i=0; i<=customers.size(); i++){
//            if(customers.get(i).getCustomerName() == name){
//                return true;
//            }
//        }
//        return false;
//    }

}
