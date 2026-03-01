/**
* AddressBook.java 
* @author Justin Meckmann                 
* Purpose:  AddressBook class that stores Name, Email and Phone of a person. 
*           Used to demonstrate the functionality of .jar files 
**/

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {

        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Name: ");
        String name = scanner.nextLine();
        System.out.printf("Email: ");
        String email = scanner.nextLine();
        System.out.printf("Phone: ");
        String phone = scanner.nextLine();

        System.out.println("\n\n------------");
        System.out.println(name + " " + email);
        System.out.println(phone);
        System.out.println("------------");

        scanner.close();
    }
}