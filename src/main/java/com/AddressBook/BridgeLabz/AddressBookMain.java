package com.AddressBook.BridgeLabz;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import static com.AddressBook.BridgeLabz.AddressBook.contactList;

/*
 * UC4 -Deleting the Contacts of AddrressBook
 */

public class AddressBookMain {

    public static void main(String a[]) {
        //Created the object of AddressBook class
        AddressBook adressbook= new AddressBook();
        ArrayList<Contacts> contactList = new ArrayList<>();

        String filepath = "C:\\Users\\dell\\IdeaProjects\\AddressBook\\src\\main\\resources\\AddressBook.txt";

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("\n 1. ADD CONTACTS \n 2. DISPLAY CONTACTS \n 3. UPDATE CONTACTS \n 4. DELETE CONTACTS \n 5. EXIT");
            System.out.println("Enter Your Choice :");

            int ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    adressbook.addContacts();
                    break;

                case 2:
                    adressbook.displayContacts();
                    break;

                case 3:
                    adressbook.updateContacts();
                    break;

                case 4:
                    adressbook.deleteContacts();
                    break;

                case 5:
                    System.out.println("Exited...!");
                    return;

                default:
                    System.out.println("Please Enter Valid Choice.....");
                    break;
            }
        }
    }

}
