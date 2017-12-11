package com.yonas;

import java.util.ArrayList;

public class Contacts {

    ArrayList<Contact> Contacts = new ArrayList<Contact>();

    public void addContact(String name, int phoneNumber){

        if(findContact(name) < 0){
            Contact newContact = new Contact(name,phoneNumber);
            Contacts.add(newContact);
        }else{
            System.out.println("Contact already exists");
        }

    }

    public void updateContact(String name, int newNumber){

        int position = findContact(name);
        if(position >= 0){
            Contact updatedContact = new Contact(name, newNumber);
            Contacts.set(position, updatedContact);
        }else{
            System.out.println("Contact does not exist.");
        }
    }

    public void removeContact(String name){
        int position = findContact(name);
        if(position >= 0){
            Contacts.remove(position);
        }else{
            System.out.println("Contact does not exist.");
        }
    }

    public void printContacts(){
        System.out.println("You have " + Contacts.size() + " contacts in you mobile phone.");
        for(int i = 0; i< Contacts.size(); i++){
            System.out.println((i+1) + ". " + Contacts.get(i));
        }
    }



    public int findContact(String contactName){
        return Contacts.indexOf(contactName);
    }


//
//    public void addNewContacts(String name, int phoneNumber){
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
}
