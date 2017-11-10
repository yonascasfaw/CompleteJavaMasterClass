package com.yonasasfaw;

public class bankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public bankAccount(){
        this(56789, 2.50, "Default name", "Default address", 55555555);
        System.out.println("Empty constructor called");
    }

    public bankAccount(int accountNumber, double balance, String customerName,
                   String email, int phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public bankAccount(String customerName, String email, int phoneNumber){
        this(98765, 568.98, customerName, email , phoneNumber );
    }

    public int getAccountNumber(){
        return this.accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getPhoneNumber(){
        return this.phoneNumber;
    }


    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }


    public void deposit(double funds){
        this.balance += funds;
        System.out.println("Your new balance after depositing "
                + funds + " is " + this.balance);
    }

    public void withdraw(double funds){
        if(funds > balance){
            System.out.println("Insufficient funds!");
        }else{
            this.balance -= funds;
            System.out.println("Your new balance after withdrawing "
                    + funds + " is " + this.balance);
        }
    }


}
