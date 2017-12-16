package com.yonas;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Bank chase = new Bank();

    public static void main(String[] args) {

        options();

        boolean quit = false;
        do {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addBranch();
                case 2:
                    addCustomer();
                case 3:
                    addTransaction();
                case 4:
                    listCustomers();
                case 5:
                    options();
                case 6:
                    quit = true;
            }


        } while (!quit);


    }

    public static void options(){
        System.out.println("Enter the number:");
        System.out.println(1 + " To add a branch.");
        System.out.println(2 + " To add a customer to a branch.");
        System.out.println(3 + " To add perform a transaction for a customer.");
        System.out.println(4 + " Print the list of customers of a branch.");
        System.out.println(5 + " To repeat the list of options.");
        System.out.println(1 + " To quit the application.");
    }

    public static void addBranch() {
        System.out.print("Enter the location of that branch: ");
        chase.addBranch(scanner.nextLine());
        scanner.nextLine();
    }

    public static void addCustomer() {
        System.out.print("Enter branch location: ");
        String location = scanner.nextLine();
        scanner.nextLine();
        if (chase.findBranch(location) >= 0) {
            System.out.print("Enter the name of the customer: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Enter initial transaction amount: ");
            Double initialTransaction = scanner.nextDouble();
            chase.addCustomer(location, name, initialTransaction);
        } else {
            System.out.println("branch does not exist at that location.");
        }

    }

    public static void addTransaction() {
        System.out.print("Enter branch location: ");
        String location = scanner.nextLine();
        scanner.nextLine();
        if (chase.findBranch(location) >= 0) {
            System.out.print("Enter name of customer: ");
            String name = scanner.nextLine();
            scanner.nextLine();
            if (chase.getBranches().get(chase.findBranch(location)).findCustomer(name) >= 0) {
                System.out.print("Enter transaction amount:");
                Double transaction = scanner.nextDouble();
                chase.addTransaction(location, name, transaction);
            } else {
                System.out.println("Customer by that name does not exist in that branch.");
            }
        }else{
            System.out.println("Chase does not have a branch at that location.");
        }


    }

    public static void listCustomers(){
        System.out.print("Enter the branch location:");
        String location = scanner.nextLine();
        scanner.nextLine();
        if(chase.findBranch(location)>=0){
            chase.listCustomers(location);
            boolean stop = false;
            do{
                System.out.print("Would you like to print out the transactions for a customer(yes/no): ");
                String choice = scanner.nextLine();
                scanner.nextLine();
                if(choice == "yes"){
                    System.out.print("Enter the name of the customer: ");
                    String name = scanner.nextLine();
                    scanner.nextLine();
                    int customerId = chase.getBranches().get(chase.findBranch(location)).findCustomer(name);
                    Customer customer = chase.getBranches().get(chase.findBranch(location)).getCustomers().get(customerId);
                    chase.getBranches().get(chase.findBranch(location)).listTransaction(customer);
                    stop = true;
                }else if(choice == "no"){
                    stop = false;
                }else{
                    System.out.println("invalid response!");
                }
            }while(!stop);

        }
    }
}
