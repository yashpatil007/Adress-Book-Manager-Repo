package com.infogalaxy;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contacts contacts = new Contacts();

    public void getContacts() {
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
    }
    public void displayContacts(){
        System.out.println(contacts.toString());
    }
    public static void main(String [] args){
        AddressBook addressBook = new AddressBook();
        addressBook.getContacts();
        addressBook.displayContacts();
    }
}