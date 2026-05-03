package q1;


public class StudentAccount {
    private String studentName; 
    private double balance; 

    // constructor
    public StudentAccount(String studentName, double balance) {
        this.studentName = studentName;
        this.balance = balance;
    }

    // getter to get balance
    public double getBalance() {
        return this.balance; 
    }

    // getter to get name
    public String getName() {
        return this.studentName; 
    }

    // deposit: 
    public void deposit(double amount) {
        // make sure amount is positive 
        if (amount > 0) {
            this.balance += amount; 
        }
        System.out.println("Deposited: " + amount); 
    }

    public void withdraw(double amount) {
        // make sure amount is positive and not larger than balance 
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount; 
        }
        System.out.println("Withdrew: " + amount); 
    }

    public static void main(String args[]) {
        StudentAccount account = new StudentAccount("Alex Kim",100); 

        // print name
        System.out.println("Student: " + account.getName()); 

        // print starting balance: 
        System.out.println("Initial balance: " + account.getBalance()); 

        // deposit 
        account.deposit(50); 

        // withdraw 
        account.withdraw(30);

        // print final balance
        System.out.println("Final balance: " + account.getBalance()); 

    }
}

/*
Reflective question: Why is it better to keep balance as a private field and update it through methods such 
as deposit() and withdraw() instead of changing it directly from main()?

By updating it through methods such as deposit() and withdraw() allows us to apply input validation and thereby 
enforces encapsulation and protects the data. I.e. we can check if a deposit is a positive number or if the
balance is large enough to be able to withdraw an certain amount. 
*/