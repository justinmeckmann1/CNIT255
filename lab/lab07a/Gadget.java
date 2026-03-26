/**
 * Gadget.java
 * @author Justin Meckmann
 * Purpose: Implements a simple Gadget class along with a compareable method and a toString method.
 */

public class Gadget implements Comparable<Gadget> {

    private String model; 
    private double price; 

    // constructor 
    public Gadget(String model, double price) {
        this.model = model; 
        this.price = price; 
    }

    // compareTo 
    @Override
    public int compareTo(Gadget other) {
        return Double.compare(this.price, other.price);
    }

    // toString
    @Override 
    public String toString() {
        return String.format("%s - %.2f$", model, price);
    }
}