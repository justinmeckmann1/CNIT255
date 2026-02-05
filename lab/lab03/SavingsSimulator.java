public class SavingsSimulator {
    public static void main {
        while (years <= 100) { 
            balance += payment;                 // yearly deposit 
            balance *= 1 + interestRate / 100;  // add interest 
        
            if (balance < 1_000) { 
                years++; 
                continue;   // skip printing small balances 
            } 
        
            System.out.printf("Year %d : $%.2f%n", years, balance); 
        
            if (balance >= goal) 
            break;     
            years++; 
        } 
    }
}
