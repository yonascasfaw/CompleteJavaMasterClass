package com.yonas;


import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    Contacts contacts = new Contacts();


    public void options(){
        System.out.println(1 + ": quit");
        System.out.println(2 + ": Print list of contacts");
        System.out.println(3 + ": add new contact");
        System.out.println(4 + ": update existing contact");
        System.out.println(5 + ": remove contact");
        System.out.println(6 + ": search/find contact");
    }

    public void choice(int choice){
        switch(choice) {
            case 1:break;
            case 2: contacts.printContacts();break;
            case 3: {
                System.out.println("Name of Contact:");
                String name = scanner.nextLine();
                scanner.nextLine();
                if(contacts.searchContact(name) == null) {
                    System.out.println("Phone number of contact:");
                    int phoneNumber = scanner.nextInt();
                    scanner.nextLine();
                    contacts.addContact(name, phoneNumber);
                    System.out.println(name + " with " + phoneNumber + "has been added.");
                }
                break;
            }
            case 4: {
                System.out.print("Name of Contact:");
                String name = scanner.nextLine();
                scanner.nextLine();
                if(contacts.searchContact(name) != null) {
                    System.out.print("Phone number of contact:");
                    int phoneNumber = scanner.nextInt();
                    scanner.nextLine();
                    contacts.updateContact(name, phoneNumber);
                }
                break;
            }
            case 5:{
                System.out.print("Name of the Contact:");
                contacts.removeContact(scanner.nextLine());
                scanner.nextLine();
            }
            case 6:{
                System.out.println("Name of the Contact:");
                Contact queryContact = contacts.searchContact(scanner.nextLine());
                scanner.nextLine();
                if(queryContact != null)
                    System.out.println(queryContact.getName() + " phone number is " + queryContact.getPhoneNumber());
                break;
            }
        }
    }


}





//    private ArrayList<Contacts> contacts = new ArrayList();
//
//    public void addContacts(){
//        System.out.print("Name of the new contact:");
//        String newName = scanner.nextLine();
//        System.out.print("Phone number of new contact:");
//        int newNumber = scanner.nextInt();
//        scanner.nextLine();
//        Contacts newContact = new Contacts(newName,newNumber);
//        contacts.add(newContact);
//    }
//
//    public void printContacts(){
//        System.out.println("You have " + contacts.size() + " contacts in you mobile phone.");
//        for(int i=0; i<contacts.size(); i++){
//            System.out.println((i+1) + ". " + contacts.get(i));
//        }
//    }
//
//    public void updateContacts(){
//        System.out.print("Enter the name of the contact you want to update:");
//        String updateName = scanner.nextLine();
//        if(findContact(updateName) >= 0){
//            System.out.print("Enter the updated phone number:");
//            int newNumber = scanner.nextInt();
//            Contacts updatedContact = new Contacts(updateName, scanner.nextInt());
//            contacts.set(findContact(updateName),updatedContact);
//        }
//
//    }
//
//    public int findContact(String contactName){
//        return contacts.indexOf(contactName);
//    }

//}
