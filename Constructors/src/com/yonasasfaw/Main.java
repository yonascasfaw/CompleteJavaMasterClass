package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        //challenge problem 1
//        bankAccount jonas = new bankAccount(2514, 521.32, "yonas", "tom@gmail.com", 552146253);
//
//        System.out.println(jonas.getPhoneNumber());
//
//        jonas.setCustomerName("Yonas Asfaw");
//        jonas.setBalance(500.00);
//
//        System.out.println("The bank account belongs to "
//                + jonas.getCustomerName() + " and has a balance of " + jonas.getBalance());
//
//        jonas.deposit(300.00);
//
//        jonas.withdraw(1000);
//
//        jonas.deposit(400);
//        jonas.withdraw(1000);
//
//        bankAccount robert = new bankAccount("Robert Baratheon", "FirstOfHisName@westoros.com", 555555555);
//        System.out.println(robert.getCustomerName() + "'s email is "
//                            + robert.getEmail() + " and has a balance of " + robert.getBalance());


        //challenge problem 2

        VipCustomer tyrion = new VipCustomer( "tyrion", 100_000.00, "tyrion@debtfree.com");
        System.out.println(tyrion.getName() + " has credit limit " + tyrion.getCreditLimit()
                + " and email " + tyrion.getEmailAddress());

    }
}
