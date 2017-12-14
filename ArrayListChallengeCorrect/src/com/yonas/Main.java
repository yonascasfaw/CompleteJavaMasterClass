package com.yonas;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone ( "5552225555");


    public static void main(String[] args) {

        boolean quit = false;
    }


        private static void addNewContact(){
            System.out.println("Enter new contact name:");
            String name = scanner.nextLine();
            System.out.println("Enter phone number:  ");
            String phone = scanner.nextLine();
            Contact newContact = Contact.createContact(name, phone);
            if(mobilePhone.addNewContact(newContact)){
                System.out.println("New contact added: name = " + name + ", phone =" + phone);
            }else{
                System.out.println("Cannot add, " + name + " already on file");
            }
        }

        private static void updateContact(){
            System.out.println("Enter existing contact name:");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if(existingContactRecord == null){
                System.out.println("Contact not found.");
                return;
            }
            System.out.println("Enter new contact name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new contact phone number: ");
            String newNumber = scanner.nextLine();
            Contact newContact = Contact.createContact(newName, newNumber);
            if(mobilePhone.updateContact(existingContactRecord, newContact)){
                System.out.println("Successfully updated record");
            }else{
                System.out.println("Error updating record.");
            }
        }
        private static void removeContact(){
            System.out.println("Enter existing contact name:");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if(existingContactRecord == null){
                System.out.println("Contact not found.");
                return;
            }

            if(mobilePhone.removeContact(existingContactRecord)){
                System.out.println("Successfully deleted");
            } else{
                System.out.println("Error deleting contact");
            }
        }

        private static void queryContact(){
            System.out.println("Enter existing contact name:");
            String name = scanner.nextLine();
            Contact existingContactRecord = mobilePhone.queryContact(name);
            if(existingContactRecord == null){
                System.out.println("Contact not found. ");
                return;
            }
            System.out.println("Name: " + existingContactRecord.getName() + " phone number is " + existingContactRecord.getPhoneNumber());
        }

        private static void startPhone(){
            System.out.println("Starting phone ....");
        }

        private static void printActions(){
            System.out.println("\nAvailable actions: \npress");
            System.out.println();
        }













}
