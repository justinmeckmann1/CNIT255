/**
 * CalculatorApp.java
 * @author Justin Meckmann
 * Purpose: Entry point for the calculator application. Initializes
 * the model, view, and controller components.
 */

import javax.swing.SwingUtilities;

public class CalculatorApp { 
    public static void main(String[] args) { 
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // Run Calculator
        SwingUtilities.invokeLater(() -> { 
            CalculatorModel model = new CalculatorModel(); 
            CalculatorView view = new CalculatorView(); 
            new CalculatorController(model, view); 
            view.setVisible(true); 
        }); 
    } 
} 