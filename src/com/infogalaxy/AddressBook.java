package com.infogalaxy;

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
            System.out.println(contacts.toString());
        }
    }
    public void editName() {
        System.out.println("Enter the First Name");
        String fname = sc.next();
        int flag = 0;
        for (int i = 0; i < contactlist.size(); i++) {
            Contacts contacts = contactlist.get(i);
            if (fname.equals(contacts.getFirstname())) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Contact is Found");
        } else {
            System.out.println("Contact is not Found");
        }
    }
        public void searchState(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the State Name for Search :");
            String stateName = scanner.next();
            int t=0;
            for(int i=0; i < contactlist.size(); i++) {
                Contacts contacts = contactlist.get(i);
                if(stateName.equals(contacts.getState())) {
                    System.out.println(contacts.getFirstname());
                    System.out.println(contacts.getLastname());
                    System.out.println(contacts.getAddress());
                    System.out.println(contacts.getCity());
                    System.out.println(contacts.getState());
                    System.out.println(contacts.getMobno());
                    System.out.println(contacts.getEmail());
                    System.out.println(contacts.getZip());
                    t=t+1;
                    System.out.println("Total Contacts Belongs To State :" +t);
                }
            }
        }
        public void deleteContact() {
            System.out.println("Enter the First Name");
            String delete = sc.next();
            for (int i = 0; i < contactlist.size(); i++) {
                Contacts contacts = contactlist.get(i);
                if (delete.equals(contacts.getFirstname())) {
                    contactlist.remove(i);
                }
            }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        Contacts contacts = new Contacts();
        int choice;
        do {
            System.out.println("*** CONTACT INVENTRY MANAGEMENT ***");
            System.out.println("1.ADD EMPLOYEE \n2.DISPLAY EMPLOYEE \n3.EDIT NAME \n4.SEARCH STATE \n5.DELETE CONTACTS \n6.EXIT");
            System.out.println("Enter your choice :");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addressBook.getContacts();
                    break;
                case 2:
                    addressBook.displayContacts();
                    break;
                case 3:
                    addressBook.editName();
                    break;
                case 4:
                    addressBook.searchState();
                    break;
                case 5:
                    addressBook.deleteContact();
                    break;

            }
        }while (choice != 6);

    }
}