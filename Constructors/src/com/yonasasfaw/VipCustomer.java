package com.yonasasfaw;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer(){
        this("John Doe", 5000.00, "JohnDoe@earth.net");
    }

    public VipCustomer(String name, double creditLimit){
        this(name, creditLimit, "JohnDoe@earth.net");
    }

    public VipCustomer( String name, double creditLimit, String emailAddress){

        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
