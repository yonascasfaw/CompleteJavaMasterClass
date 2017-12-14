package com.yonas;

import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> transactions = new ArrayList<Double>();

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public void addTransaction(Double transaction){
        transactions.add(transaction);
    }
}
