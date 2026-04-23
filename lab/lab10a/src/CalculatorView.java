/**
 * CalculatorView.java
 * @author Justin Meckmann
 * Purpose: View class for the calculator. Builds the graphical user
 * interface and handles user interaction input and output.
 */

import javax.swing.*;
import java.awt.*;

public class CalculatorView extends JFrame {

    private JPanel buttonGrid; 
    private JMenuItem miQuit;
    private JMenuItem miAbout;

    private final JTextField display = new JTextField("0", 20);

    // Responsible for building and displaying the GUI.
    public CalculatorView() {
        super("Calculator Lab - Justin Meckmann");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        display.setHorizontalAlignment(SwingConstants.RIGHT);
        display.setEditable(false);
        display.setFont(display.getFont().deriveFont(Font.PLAIN, 24f));

        buttonGrid = new JPanel(new GridLayout(5, 4, 4, 4));
        String[] keys = {
                "AC", "C",  "√",  "±",
                "7",  "8",  "9",  "÷",
                "4",  "5",  "6",  "x",
                "1",  "2",  "3",  "-",
                "0",  ".",  "=",  "+"
        };

        // Create and add buttons
        for (String k : keys) {
            JButton b = new JButton(k);
            b.setFont(b.getFont().deriveFont(Font.PLAIN, 20f));
            buttonGrid.add(b);
        }

        // Create menu bar
        JMenuBar mb = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenu mHelp = new JMenu("Help");

        // Create menu items
        miQuit  = new JMenuItem("Quit");
        miAbout = new JMenuItem("About");

        // Add menu actions
        miQuit.addActionListener(e -> System.exit(0));
        miAbout.addActionListener(
                e -> JOptionPane.showMessageDialog(
                        this,
                        "Calculator Lab\nAuthor: Justin Meckmann\n© 2025",
                        "About",
                        JOptionPane.INFORMATION_MESSAGE));

        // Build and set menu bar
        mFile.add(miQuit);
        mHelp.add(miAbout);
        mb.add(mFile);
        mb.add(mHelp);
        setJMenuBar(mb);

        // Build main layout
        JPanel root = new JPanel(new BorderLayout(8, 8));
        root.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
        root.add(display, BorderLayout.NORTH);
        root.add(buttonGrid, BorderLayout.CENTER);
        setContentPane(root);
        pack();
        setLocationRelativeTo(null);  // center on screen
    }

    // Update displayed text
    public void updateDisplay(String text) {
        display.setText(text);
    }

    // getter for controller
    public JPanel getButtonGrid() {
        return buttonGrid;
    }
}