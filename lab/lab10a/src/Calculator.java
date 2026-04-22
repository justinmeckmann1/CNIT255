import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Lab10: Calulator.java
 */
public class Calculator extends JFrame implements ActionListener {

    private final JTextField display = new JTextField("0", 20);

    private double  accumulator   = 0.0;
    private String  pendingOp     = "=";
    private boolean startNewEntry = true;

    public Calculator() {
        super("Calculator Lab – Your Name");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setFont(display.getFont().deriveFont(Font.PLAIN, 24f));

        JPanel buttonGrid = new JPanel(new GridLayout(5, 4, 4, 4));
        String[] keys = {
                "AC", "C",  "√",  "±",
                "7",  "8",  "9",  "÷",
                "4",  "5",  "6",  "x",
                "1",  "2",  "3",  "-",
                "0",  ".",  "=",  "+"
        };
        for (String k : keys) {
            JButton b = new JButton(k);
            b.setFont(b.getFont().deriveFont(Font.PLAIN, 20f));
            b.addActionListener(this);
            buttonGrid.add(b);
        }

        JMenuBar mb = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mHelp = new JMenu("Help");

        JMenuItem miQuit  = new JMenuItem("Quit");
        JMenuItem miAbout = new JMenuItem("About");

        miQuit.addActionListener(e -> System.exit(0));
        miAbout.addActionListener(
                e -> JOptionPane.showMessageDialog(
                        this,
                        "Calculator Lab\nAuthor: Your Name\n© 2025",
                        "About",
                        JOptionPane.INFORMATION_MESSAGE));

        mFile.add(miQuit);
        mHelp.add(miAbout);
        mb.add(mFile);
        mb.add(mHelp);
        setJMenuBar(mb);

        JPanel root = new JPanel(new BorderLayout(8, 8));
        root.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        root.add(display, BorderLayout.NORTH);
        root.add(buttonGrid, BorderLayout.CENTER);
        setContentPane(root);
        pack();
        setLocationRelativeTo(null);  // center on screen
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String key = ((JButton) e.getSource()).getText();

        if ("0123456789.".contains(key)) {            // ----- digits & decimal point
            enterDigit(key);
        } else if ("±".equals(key)) {                 // ----- sign change
            toggleSign();
        } else if ("√".equals(key)) {                 // ----- square root
            applyUnary(Math::sqrt);
        } else if ("C".equals(key)) {                 // ----- clear current entry
            display.setText("0");
            startNewEntry = true;
        } else if ("AC".equals(key)) {                // ----- clear everything
            accumulator   = 0;
            pendingOp     = "=";
            display.setText("0");
            startNewEntry = true;
        } else {                                      // ----- +  −  x  ÷  =
            applyBinary(key);
        }
    }


    private void enterDigit(String d) {
        if (startNewEntry) {
            display.setText(".".equals(d) ? "0." : d);
            startNewEntry = false;
        } else if (!(".".equals(d) && display.getText().contains("."))) {
            display.setText(display.getText() + d);
        }
    }

    private void toggleSign() {
        if (display.getText().equals("0")) return;
        if (display.getText().startsWith("-"))
            display.setText(display.getText().substring(1));
        else
            display.setText("-" + display.getText());
    }

    private void applyUnary(java.util.function.DoubleUnaryOperator op) {
        try {
            double v = Double.parseDouble(display.getText());
            double r = op.applyAsDouble(v);
            displayResult(r);
            startNewEntry = true;
        } catch (NumberFormatException ex) {
            showError();
        }
    }

    private void applyBinary(String op) {
        try {
            double current = Double.parseDouble(display.getText());

            switch (pendingOp) {        // finish previous pending operation
                case "+": accumulator += current; break;
                case "-": accumulator -= current; break;
                case "x": accumulator *= current; break;
                case "÷":
                    if (current == 0) { showError(); return; }
                    accumulator /= current;
                    break;
                case "=": accumulator = current; break;
            }
            pendingOp = op.equals("=") ? "=" : op;   // remember new pending operator
            displayResult(accumulator);
            startNewEntry = true;
        } catch (NumberFormatException ex) {
            showError();
        }
    }

    private void displayResult(double val) {
        // trim trailing zeros for integers, limit to 12 characters
        String s = String.format("%.10f", val).replaceAll("\\.?0+$", "");
        if (s.length() > 12) s = String.format("%.6e", val);  // fallback to scientific
        display.setText(s);
    }

    private void showError() {
        display.setText("Error");
        accumulator   = 0;
        pendingOp     = "=";
        startNewEntry = true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().setVisible(true));
    }
}

