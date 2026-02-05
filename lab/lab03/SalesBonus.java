/**
* SalesBonus.java 
* @author Justin Meckmann                 
* Purpose: Returning employee bonus based on their sales performance in regard to a target using if / if else / else statements
*/

public class SalesBonus { 

    public static final double TARGET = 10000;
    public static void main(String[] args) { 
        int yourSales = Integer.parseInt(args[0]); // parses the passed args as an int
        final int TARGET = 10_000;   // constant goal 

        String performance; 
        double bonus; 

        // decision ladder 
        if (yourSales >= 2 * TARGET) { // ≥ 2 × target
            performance = "Excellent"; 
            bonus = 1000; 
        }
        else if (yourSales >= 1.5 * TARGET) { // ≥ 1.5 × target
            performance = "Fine"; 
            bonus = 500;    
        }
        else if (yourSales >= 1 * TARGET) { // ≥ target
            performance = "Satisfactory"; 
            bonus = 100;  
        }
        else { // < target 
            performance = "You're fired"; 
            bonus = 0; 
        }

        System.out.printf("Performance: %s | Bonus: $%.2f%n", performance, bonus); 
    } 
} 