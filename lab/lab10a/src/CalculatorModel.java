
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

    private String formatResult(double val) {
        // trim trailing zeros for integers, limit to 12 characters
        String s = String.format("%.10f", val).replaceAll("\\.?0+$", "");
        if (s.length() > 12) s = String.format("%.6e", val);  // fallback to scientific
        return s;
    }

    private String showError() {
        displayText   = "Error"; 
        accumulator   = 0;
        pendingOp     = "=";
        startNewEntry = true;

        return displayText; 
    }

    public String clearEntry() {
        // Clear current entry
        displayText = "0"; 
        startNewEntry= true; 
        return displayText; 
    }

    public String clearAll() {
        // clear current entry and memory
        accumulator = 0; 
        pendingOp = "=";
        startNewEntry = true; 
        displayText = "0"; 
        
        return displayText; 

    }
}
