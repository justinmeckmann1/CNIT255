import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Lab10: Calulator.java
 */
public class Calculator extends JFrame implements ActionListener {

    

    public Calculator() {

        // for (String k : keys) {
        //     JButton b = new JButton(k);
        //     b.setFont(b.getFont().deriveFont(Font.PLAIN, 20f));
        //     b.addActionListener(this); --> Not copied! 
        //     buttonGrid.add(b);
        // }


        

        miQuit.addActionListener(e -> System.exit(0));
        miAbout.addActionListener(
                e -> JOptionPane.showMessageDialog(
                        this,
                        "Calculator Lab\nAuthor: Justin Meckmann\n© 2026",
                        "About",
                        JOptionPane.INFORMATION_MESSAGE));



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





    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Calculator().setVisible(true));
    }
}

