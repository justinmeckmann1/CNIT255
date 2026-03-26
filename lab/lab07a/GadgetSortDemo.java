import java.util.Arrays;

/**
 * GadgetSortDemo.java
 * @author Justin Meckmann
 * Purpose: Demonstrates the Gadget class and the functionality of the comparable method.
 */


public class GadgetSortDemo {
    public static void main() {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // Create array of Gadgets
        Gadget[] gadgets = {
            new Gadget("Model5", 5.00), 
            new Gadget("Model1", 5.90), 
            new Gadget("Model3", 1.00), 
            new Gadget("Model2", 5.00), 
            new Gadget("Model4", 100.00), 
        };

        // Sort the array
        Arrays.sort(gadgets); 

        // print contents
        for (Gadget g : gadgets) {
            System.out.println(g);
        }
    }
}