/**
* SavingsSimulator_v2.java 
* @author Justin Meckmann                 
* Purpose: Calculates savgings based on a yearly deposit and interest rate. Stops once the goal is reached.
           Modified version, replacing the break statement with a condition in the loop
*/


public class SavingsSimulator_v2 {
    public static void main(String[] args) { 
        System.out.println("Username: " + System.getProperty("user.name"));
        System.out.println("Time: " + java.time.LocalDateTime.now().toString());
        
        int years = 1;              // initializing years, starting with 1
        double payment = 500;       // this could also be an int. Used double to adress a case, where the payment might not be a whole number 
        double balance = 0;         // starting balance
        double interestRate = 5; // 5% interest rate 
        double goal = 10000;        // goal this could also be an int. Used double to adress a case, where the goal might not be a whole number 

        while (years <= 100 && balance < goal) { // including balance check in the condition for the while loop
            balance += payment;                 // yearly deposit 
            balance *= 1 + interestRate / 100;  // add interest 
        
            if (balance < 1_000) { 
                years++; 
                continue;   // skip printing small balances 
            } 
        
            System.out.printf("Year %d : $%.2f%n", years, balance); 
        
            years++; 
        } 

        System.out.println("Number of years to reach the goal: " + years);
    }
}
