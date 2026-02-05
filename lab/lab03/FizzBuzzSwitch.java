/**
* FizzBuzzSwitch.java 
* @author Justin Meckmann                 
* Purpose: Classic FizzBuzz using switch statements. Return Fizz if a number is 
*          divisible by 3, returns Buzz if a number is devisible by 5 and FizzBuzz if divisible by both
*/

public class FizzBuzzSwitch { 
    public static void main(String[] args) { 
        System.out.println("Username: " + System.getProperty("user.name"));
        System.out.println("Time: " + java.time.LocalDateTime.now().toString());

        for (int n = 1; n <= 30; n++) { // iterate from 1 to 30
            switch (n % 15) {
                case 0:
                    System.out.println("FizzBuzz"); // if n % 15 = 0 -> number divisible by 15
                    break;
                case 3,6,9,12:
                    System.out.println("Fizz"); // if n % 15 = 3,6,9 or 12 -> number divisible by 3
                    break;
                case 5, 10:
                    System.out.println("Buzz"); // if n % 15 = 5 or 10 -> number divisible by 5
                    break;
                default:
                    System.out.println(n); // if none of the previous cases are true, print the number
            }
        }
    } 
} 