package com.infogalaxy;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
        static Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contactArrayList = new ArrayList<>();

        private void addContact(){
            Contact contact = new Contact();
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
            contactArrayList.add(contact);
            System.out.println("Size of List: "+contactArrayList.size());
        }

        private void showContact(){
            try {
                for(int i = 0; i< contactArrayList.size(); i++){
                    Contact contact = contactArrayList.get(i);
                    System.out.println(contact.toString());
                }
            }catch(NullPointerException npe){
                System.out.println("Contact is Blank");
            }
        }

        private void editContact(){
            Contact contact = new Contact();
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
        public void deleteContact(){
            Contact contact = new Contact();
            System.out.println("Enter the Name: ");
            String fname = scanner.next();
            if(fname.equalsIgnoreCase(contact.getFirstName())){
                System.out.println("Contact Found");
                contact = null ;
            }else{
                System.out.println("Contact Not Found");
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        AddressBookMain addressBookMain = new AddressBookMain();
        int ch;
        do {
            System.out.println("1. Add Contact " + "\n" + "2.Edit Contact" + "\n" + "3.Delete Contact" + "\n" + "4.Show Contact");
            System.out.println("Enter the choice: ");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    addressBookMain.addContact();
                    break;

                case 2:
                    addressBookMain.editContact();
                    break;

                case 3:
                    addressBookMain.deleteContact();
                    break;

                case 4:
                    addressBookMain.showContact();
                    break;
            }
        }while(ch != 5);

    }
}
