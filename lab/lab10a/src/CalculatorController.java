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

        for (Component c : buttonGrid.getComponents()) {
            JButton b = (JButton) c;
            b.addActionListener(this);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String key = ((JButton) e.getSource()).getText();

        if ("0123456789.".contains(key)) {            // ----- digits & decimal point
            view.updateDisplay(model.enterDigit(key));
        } else if ("±".equals(key)) {                 // ----- sign change
            view.updateDisplay(model.toggleSign());
        } else if ("√".equals(key)) {                 // ----- square root
            view.updateDisplay(model.applyUnary(Math::sqrt));
        } else if ("C".equals(key)) {                 // ----- clear current entry
            view.updateDisplay(model.clearEntry());
        } else if ("AC".equals(key)) {                // ----- clear everything
            view.updateDisplay(model.clearAll());

        } else {                                      // ----- +  −  x  ÷  =
            view.updateDisplay(model.applyBinary(key));
        }
    }
}