/**
 * CalculatorController.java
 * @author Justin Meckmann
 * Purpose: Controller class for the calculator. Handles user input,
 * communicates between the view and model, and updates results.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;

public class CalculatorController implements ActionListener {
    private CalculatorModel model; 
    private CalculatorView view; 

    // Responsible for connecting the model and view and handling user actions.
    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model; 
        this.view = view;

        // attach listeners to all buttons
        JPanel buttonGrid = view.getButtonGrid();

        // Add listeners to buttons
        for (Component c : buttonGrid.getComponents()) {
            JButton b = (JButton) c;
            b.addActionListener(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String key = ((JButton) e.getSource()).getText();       // Get key

        if ("0123456789.".contains(key)) { 
            view.updateDisplay(model.enterDigit(key));          // digits & decimal point
        } 
        else if ("±".equals(key)) { 
            view.updateDisplay(model.toggleSign());             // sign change
        }
        else if ("√".equals(key)) { 
            view.updateDisplay(model.applyUnary(Math::sqrt));   // square root
        }
        else if ("C".equals(key)) { 
            view.updateDisplay(model.clearEntry());             // clear current entry
        }
        else if ("AC".equals(key)) {
            view.updateDisplay(model.clearAll());               // clear everything
        }
        else { 
            view.updateDisplay(model.applyBinary(key));         // +  −  x  ÷  =
        }
    }
}