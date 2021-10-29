package com.blp.addressbook;

import java.util.Scanner;

/**
 * Address book creation
 */
public class AddressBook {
    public static void main(String[] args) {
        System.out.println("Welcome to Address book program");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for add contact" + ","+
                "2 for End program");
        int choice = sc.nextInt();
        if (choice == 1) {
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

            AddressBook contact1 = new AddressBook();
            contact1.addContact(firstName, lastName, address, city, state, zip, mobNum, emailId);
        }
        if (choice == 2){
            System.out.println("Program ended..Thank You");
        }
    }

    private void addContact(String firstName, String lastName, String address, String city, String state, int zip, long mobNum, String emailId) {
        System.out.println("First name = " + firstName);
        System.out.println("Last name = " + lastName);
        System.out.println("Address = " + address);
        System.out.println("City = " + city);
        System.out.println("State = " + state);
        System.out.println("Zip = " + zip);
        System.out.println("Mobile Number = " + mobNum);
        System.out.println("Email-Id = " + emailId);
    }
}


