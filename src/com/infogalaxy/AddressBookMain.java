package com.infogalaxy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

        public void showContact(){
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
            System.out.println("Enter the First Name: ");
            String fname = scanner.next();
            int isAvailable = 0;
            for(int i = 0; i < contactArrayList.size(); i++) {
                Contact contact = contactArrayList.get(i);
                if (fname.equalsIgnoreCase(contact.getFirstName())) {
                    isAvailable = 1;
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
                    break;
                }
            }if(isAvailable == 0){
                System.out.println("Contact Not Found");
            }
        }
        public void deleteContact(){
            System.out.println("Enter the Name: ");
            String fname = scanner.next();
            int isAvailable  = 0;
            for(int i = 0; i < contactArrayList.size(); i++) {
                Contact contact = contactArrayList.get(i);
                if (fname.equalsIgnoreCase(contact.getFirstName())) {
                    isAvailable = 1;
                    System.out.println("Contact Found");
                    contactArrayList.remove(i);
                    break;
                }
            }if(isAvailable == 0){
                System.out.println("Contact Not Found");
            }
        }
        public void backupToFile(){
            try {
                String contactData = null;
                for (int i = 0; i < contactArrayList.size(); i++) {
                    Contact contact = contactArrayList.get(i);
                    contactData = contact.getFirstName() + "," + contact.getLastName() + "," + contact.getAddress() + "," + contact.getCity() + "," + contact.getState() + "," + contact.getZip() + "," + contact.getPhoneNumber() + "," + contact.getEmail() + "\n" + contactData;
                }
                Path file = Paths.get("MyAddressBook.txt");
                byte[] byteData = contactData.getBytes();
                Files.write(file, byteData);
            }
            catch(NullPointerException npe){
                System.out.println("Contact is Blank.");
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book program");
        AddressBookMain addressBookMain = new AddressBookMain();
        int ch;
        do {
            System.out.println("1. Add Contact " + "\n" + "2.Edit Contact" + "\n" + "3.Delete Contact" + "\n" + "4.Show Contact"+"\n"+"5.Backup To Files");
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
                case 5:
                    addressBookMain.backupToFile();
                    break;
            }
        }while(ch != 6);

    }
}
