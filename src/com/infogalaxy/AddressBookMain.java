package com.infogalaxy;

import java.util.Scanner;

public class AddressBookMain {

        Contact contact = new Contact();
        Scanner scanner = new Scanner(System.in);

        private void addContact(){
            System.out.println("Enter the First Name: ");
            contact.setFirstName(scanner.next());
            System.out.println("Enter the Last Name: ");
            contact.setLastName(scanner.next());
            System.out.println("Enter the Address: ");
            contact.setAddress(scanner.next());
            System.out.println("Enter the City Name: ");
            contact.setCity(scanner.next());
            System.out.println("Enter the State Name: ");
            contact.setState(scanner.next());
            System.out.println("Enter the Zip code: ");
            contact.setZip(scanner.next());
            System.out.println("Enter the Phone Number: ");
            contact.setPhoneNumber(scanner.next());
            System.out.println("Enter the Email Id: ");
            contact.setEmail(scanner.next());
        }

        private void showContact(){
            System.out.println(contact.toString());
        }

        private void editContact(){
            System.out.println("Enter the First Name: ");
            String fname = scanner.next();
            if(fname.equalsIgnoreCase(contact.getFirstName())){
                System.out.println("Contact Found");

                System.out.println("Enter the Last Name: ");
                contact.setLastName(scanner.next());
                System.out.println("Enter the Address: ");
                contact.setAddress(scanner.next());
                System.out.println("Enter the City Name: ");
                contact.setCity(scanner.next());
                System.out.println("Enter the State Name: ");
                contact.setState(scanner.next());
                System.out.println("Enter the Zip code: ");
                contact.setZip(scanner.next());
                System.out.println("Enter the Phone Number: ");
                contact.setPhoneNumber(scanner.next());
                System.out.println("Enter the Email Id: ");
                contact.setEmail(scanner.next());

            }else{
                System.out.println("Contact Not Found");
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        AddressBookMain addressBookMain = new AddressBookMain();
        addressBookMain.addContact();
        addressBookMain.showContact();
        addressBookMain.editContact();
        addressBookMain.showContact();
    }
}
