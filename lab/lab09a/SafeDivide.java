/**
 * SafeDivide.java
 * @author Justin Meckmann
 * Purpose: Demonstrating usage of exepctions to handle simple runtime excepations
 */


import java.util.Scanner;

public class SafeDivide {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap


        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                // prompt user to enter the first number
                System.out.print(("Enter the first number: "));
                String input1 = scanner.nextLine();

                // prompt user to enter the second number
                System.out.print(("Enter the second number: "));
                String input2 = scanner.nextLine();

                // call divide function
                int result = divide(input1, input2);  
                System.out.println(input1 + " / " + input2 + " = " + result);
                break; 
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.\n");
            }
            catch (ArithmeticException e) {
                System.out.println("Plese enter a non zero number for the second number.\n");
            }
        }


        scanner.close();
        
        
    }

    public static int divide(String a, String b) {
        // takes two strings as input, casts to int 
        // and performs integer divison 
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        return (num1 / num2); 
    }
}
