package com.yonas;

import java.util.ArrayList;

public class Contacts {

    ArrayList<Contact> Contacts = new ArrayList<Contact>();

    public int addContact(String name, int phoneNumber){

        if(findContact(name) < 1){
            Contact newContact = new Contact(name,phoneNumber);
            Contacts.add(newContact);
            return 1;
        }else{
            System.out.println("Contact already exists");
            return 0;
        }

    }

    public int updateContact(String name, int newNumber){

        int position = findContact(name);
        if(position >= 1){
            Contact updatedContact = new Contact(name, newNumber);
            Contacts.set(position, updatedContact);
            return 1;
        }else{
            System.out.println("Contact does not exist.");
            return 0;
        }
    }

    public void removeContact(String name){
        int position = findContact(name);
        if(position >= 1){
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

    public Contact searchContact(String contactName){
        return Contacts.get(findContact(contactName));
    }



    private int findContact(String contactName){
//        return Contacts.indexOf(contactName);
        for(int i=0; i<Contacts.size(); i++){
            if(contactName == Contacts.get(i).getName()){
                return 1;

            }
        }
        return 0;
    }


//
//    public void addNewContacts(String name, int phoneNumber){
//        this.name = name;
//        this.phoneNumber = phoneNumber;
//    }
}
