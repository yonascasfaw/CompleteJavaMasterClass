package com.yonas;

import java.util.ArrayList;

public class Branch {
    private String branchLocation;
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    public Branch(String branchLocation){
        this.branchLocation = branchLocation;
    }

    public String getBranchLocation(){
        return branchLocation;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
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

    public boolean listTransaction(Customer customer){
        if(findCustomer(customer.getCustomerName())>=0) {
            for (int i = 0; i <= customer.getTransactions().size(); i++) {
                System.out.println(customer.getTransactions().get(i));
            }
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

    public String searchCustomer(int index){
        return customers.get(index).getCustomerName();
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
