package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        //challenge problem 1
        bankAccount jonas = new bankAccount(2514, 521.32, "yonas", "tom@gmail.com", 552146253);

        System.out.println(jonas.getPhoneNumber());

        jonas.setCustomerName("Yonas Asfaw");
        jonas.setBalance(500.00);

        System.out.println("The bank account belongs to "
                + jonas.getCustomerName() + " and has a balance of " + jonas.getBalance());

        jonas.deposit(300.00);

        jonas.withdraw(1000);

        jonas.deposit(400);
        jonas.withdraw(1000);


    }
}
