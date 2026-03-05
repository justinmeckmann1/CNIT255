/**
* CoffeeTest.java
* @author Justin Meckmann
* Purpose:  Demonstrate CoffeeSize enum.
*           Reads a coffee size abbreviation from the user and
*           prints the coffee size, abbreviation, and volume.
**/


import java.util.Scanner;

public class CoffeeTest {
    public static void main() {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap



        Scanner scanner = new Scanner(System.in); 
        String abbr; 


        System.out.printf("Enter a abbreviation: ");
        abbr = scanner.nextLine();

        CoffeeSize myCoffee = CoffeeSize.ofAbbreviation(abbr);

        if (myCoffee == null) {
            System.out.println("Abbreviation not found");
        }
        else {
            System.out.println(myCoffee.name() + " (" + myCoffee.getAbbreviation() + ") = "  + myCoffee.getVolume() +" mL");
        }

        scanner.close();
    }
}