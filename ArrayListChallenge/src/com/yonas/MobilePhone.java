package com.yonas;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private ArrayList<Contacts> contacts = new ArrayList();

    public void addContacts(){
        System.out.print("Name of the new contact:");
        String newName = scanner.nextLine();
        System.out.print("Phone number of new contact:");
        int newNumber = scanner.nextInt();
        scanner.nextLine();
        Contacts newContact = new Contacts(newName,newNumber);
        contacts.add(newContact);
    }

    public void printContacts(){
        System.out.println("You have " + contacts.size() + " contacts in you mobile phone.");
        for(int i=0; i<contacts.size(); i++){
            System.out.println((i+1) + ". " + contacts.get(i));
        }
    }

    public void updateContacts(){
        System.out.print("Enter the name of the contact you want to update:");
        String updateName = scanner.nextLine();
        if(findContact(updateName) >= 0){
            System.out.print("Enter the updated phone number:");
            int newNumber = scanner.nextInt();
            Contacts updatedContact = new Contacts(updateName, scanner.nextInt());
            contacts.set(findContact(updateName),updatedContact);
        }

    }

    public int findContact(String contactName){
        return contacts.indexOf(contactName);
    }

}
