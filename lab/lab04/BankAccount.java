/**
* BankAccount.java 
* @author Justin Meckmann                 
* Purpose: Bank account class the allows: 
    - creating an account using the owners name
    - depositing and withdrawing money
    - displaying the account balance
**/

public class BankAccount {
    // main method 
    public static void main(String[] args) {
        // Identification and Timestamp
        String username = System.getProperty("user.name");
        String time = java.time.LocalDateTime.now().toString();
        System.out.println(username);
        System.out.println(time);


        System.out.println(); // new line


        BankAccount myAccount = new BankAccount("Ada", 1250.00);
        
        myAccount.withdraw(100);    // withdraw 
        myAccount.deposit(100);     // deposit
        
        System.out.println(myAccount);      // print --> automatically alls .toString()
    }

    private String owner; 
    private double balance; 

    // Constructor
    public BankAccount(String owner, double openingBalance) {
        this.owner = owner;
        this.balance = openingBalance;
    }

    // Deposit method (ignores negatives)
    public void deposit(double amount) {
         // only deposit positive amounts
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
        // only withdraw positive amounts smaller or equal to the balance
        if (amount <= balance && amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    // getter to get balance
    public double getBalance() {
        return balance;
    }

    // toString override
    @Override
    public String toString() {
        return String.format("%s's account: $%.2f.", owner, balance);
    }
}



