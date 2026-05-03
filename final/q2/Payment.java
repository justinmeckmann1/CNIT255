package q2;


public abstract class Payment {
    protected double amount;

    // constructor
    public Payment(double amount) {
        this.amount = amount;
    }

    // method to print amount
    public void displayAmount() {
        System.out.println("Payment amount: " + amount);
    }
}
