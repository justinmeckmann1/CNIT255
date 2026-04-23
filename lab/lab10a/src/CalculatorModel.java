/**
 * CalculatorModel.java
 * @author Justin Meckmann
 * Purpose: Model class for the calculator. Performs arithmetic
 * operations such as addition, subtraction, multiplication, and division.
 */

public class CalculatorModel {
    // Responsible for calculator logic and state.

    private double  accumulator;
    private String  pendingOp;
    private boolean startNewEntry;
    private String  displayText; 


    // initialize fields with default values
    public CalculatorModel() {
        accumulator = 0.0;
        pendingOp = "=";
        startNewEntry = true;
        displayText = "0"; 
        
    }

    // display text getter function
    public String getDisplayText() {
        return displayText; 
    }

    // handle digit input
    public String enterDigit(String d) {
        if (startNewEntry) {
            displayText = ".".equals(d) ? "0." : d;
            startNewEntry = false;
        } 
        else if (!(".".equals(d) && displayText.contains("."))) {
            displayText = displayText + d;
        }
        return displayText; 
    }

    // handle sign toggle
    public String toggleSign() {
        if (displayText.equals("0")){
            return displayText;
        }
        if (displayText.startsWith("-"))
            // remove "-" prefix
            displayText = displayText.substring(1);
        else
            // add "-"
            displayText =  "-" + displayText; 

        return displayText; 
    }

    // handle unary operations
    public String applyUnary(java.util.function.DoubleUnaryOperator op) {
        try {
            double v = Double.parseDouble(displayText); // get value from displayText ad double
            double r = op.applyAsDouble(v);             // apply operation

            displayText = formatResult(r); 
            startNewEntry = true;
            return displayText;

        } catch (NumberFormatException ex) {
            return showError();
        }
    }

    // handle binary operations
    public String applyBinary(String op) {
        try {
            double current = Double.parseDouble(displayText);

            switch (pendingOp) {        // finish previous pending operation
                case "+": accumulator += current; break;
                case "-": accumulator -= current; break;
                case "x": accumulator *= current; break;
                case "÷":
                    if (current == 0) {
                        return showError();
                    }
                    accumulator /= current;
                    break;
                case "=": accumulator = current; break;
            }

            pendingOp = op.equals("=") ? "=" : op;   // remember new pending operator
            displayText = formatResult(accumulator);
            startNewEntry = true;
            return displayText; 

        } catch (NumberFormatException ex) {
            return showError();
        }
    }

    // format double to a string
    private String formatResult(double val) {
        // trim trailing zeros for integers, limit to 12 characters
        String s = String.format("%.10f", val).replaceAll("\\.?0+$", "");
        if (s.length() > 12) s = String.format("%.6e", val);  // fallback to scientific
        return s;
    }

    // display an error
    private String showError() {
        displayText   = "Error"; 
        accumulator   = 0;
        pendingOp     = "=";
        startNewEntry = true;

        return displayText; 
    }

    // Clear current entry
    public String clearEntry() {
        displayText = "0"; 
        startNewEntry= true; 
        return displayText; 
    }

    // clear current entry and memory
    public String clearAll() {
        accumulator = 0; 
        pendingOp = "=";
        startNewEntry = true; 
        displayText = "0"; 
        
        return displayText; 

    }
}
