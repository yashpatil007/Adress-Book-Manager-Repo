package com.infogalaxy;

import com.sun.deploy.util.SyncAccess;

import java.util.ArrayList;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contacts> contactlist = new ArrayList();

    public void getContacts() {
        Contacts contacts = new Contacts();
        System.out.println("Enter the First Name :");
        contacts.setFirstname(sc.next());
        System.out.println("Enter the Last Name :");
        contacts.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the City :");
        contacts.setAddress(sc.next());
        System.out.println("Enter the State :");
        contacts.setState(sc.next());
        System.out.println("Enter the Mobile No :");
        contacts.setMobno(sc.next());
        System.out.println("Enter the Email Id :");
        contacts.setEmail(sc.next());
        System.out.println("Enter the Zip Code :");
        contacts.setZip(sc.next());
        contactlist.add(contacts);
    }

    public void displayContacts() {
        for (int i = 0; i < contactlist.size(); i++) {
            Contacts contacts = contactlist.get(i);
            System.out.println(contactlist.toString());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts();
        int choice;
        do {
            System.out.println("*** CONTACT INVENTRY MANAGEMENT ***");
            System.out.println("1.ADD EMPLOYEE \n2.DISPLAY EMPLOYEE \n3.EXIT");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.getContacts();
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
            }

        }while (choice != 3);

    }
}