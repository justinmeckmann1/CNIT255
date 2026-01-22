import java.util.Scanner;

/**
* IntegerRangeSurvey.java
 * @author Justin Meckmann
* Purpose: Accept user input (1-4) and print the range of the selected integer type.
* Notes: For this exercise, assume the user always enters 1-4 (no validation required).
*/
public class IntegerRangeSurvey {
    public static void main(String[] args) 
    {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString());
        

        // Accept and process user input; must import Scanner for this to work
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a Java integer type to see its range:");
        System.out.println("1: byte");
        System.out.println("2: short");
        System.out.println("3: int");
        System.out.println("4: long");
        System.out.print("Enter 1-4: ");
        int choice = input.nextInt();

        input.close(); // close scanner to avoid error

        if (choice == 1) {
            System.out.println("In a byte-typed variable, you can assign values from "
            + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ".");
        } 
        else if (choice == 2) {
            System.out.println("In a short-typed variable, you can assign values from "
            + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ".");
        }
        else if (choice == 3) {
            System.out.println("In a int-typed variable, you can assign values from "
            + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ".");
        } 
        else if (choice == 4) {
            System.out.println("In a long-typed variable, you can assign values from "
            + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ".");
        } 
        else {
            System.out.println("Invalid option.");
        }
    }
}