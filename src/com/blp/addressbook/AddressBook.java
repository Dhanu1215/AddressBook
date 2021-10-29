package com.blp.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Address book creation
 */
public class AddressBook {
    private ArrayList<Contacts> list = new ArrayList<Contacts>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");
        Scanner sc = new Scanner(System.in);
        System.out.println(" 1. Add contact. ");
        System.out.println(" 2. Edit contact. ");
        System.out.println(" 3. Delete contact. ");
        int choice = sc.nextInt();
        AddressBook contact1 = new AddressBook();

        switch (choice) {

            case 1:
                while (choice != 0) {
                    System.out.println("Enter Contact Details");
                    System.out.println("Enter firstname");
                    String firstName = sc.next();
                    System.out.println("Enter lastname");
                    String lastName = sc.next();
                    System.out.println("Enter address");
                    String address = sc.next();
                    System.out.println("Enter city");
                    String city = sc.next();
                    System.out.println("Enter state");
                    String state = sc.next();
                    System.out.println("Enter zip");
                    int zip = sc.nextInt();
                    System.out.println("Enter mobile number");
                    long mobNum = sc.nextLong();
                    System.out.println("Enter email-Id");
                    String emailId = sc.next();
                    contact1.addContact(firstName, lastName, address, city, state, zip, mobNum, emailId);
                }
                break;
            default:
                System.out.println("Enter valid Number");
        }
        System.out.println("Program ended..Thank You");
    }

    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, long mobNum, String emailId) {
        Contacts person = new Contacts(firstName, lastName, address, city, state, zip, mobNum, emailId);
        list.add(person);
        person.display();
    }
}

