package q2;


public class CreditCardPayment extends Payment implements Payable {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    // override interface method
    @Override
    public void makePayment() {
        System.out.println("Credit card payment processed.");
    }

    // main method for calling and reproducing output
    public static void main(String[] args) {
        // initialize obj
        CreditCardPayment payment = new CreditCardPayment(250.0);
        
        // print amount
        payment.displayAmount();
        
        // make payment
        payment.makePayment();
    }
}

/* 
Reflective question: In this program, what responsibility is handled by the 
abstract class and what responsibility is handled by the interface? 

The abstract class Payment handles shared data and functionality, such as storing the amount and 
displaying it. The interface Payable defines a required behavior (i.e. a contract between classes 
-> makePayment()), and thereby ensures that all implementing classes implement their own payment logic.

*/

