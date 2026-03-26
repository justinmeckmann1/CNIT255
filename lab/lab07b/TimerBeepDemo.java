
/**
* TimerBeepDemo.java
* @author Justin Meckmann
* Purpose:  Demonstrates the use of a swing Timer and the 
            how it can be used to execute an action at specified
            intervals until it is stopped.
*/


import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// import differ from hint --> variable Timer existed twice in bulk imports

public class TimerBeepDemo {

    // action listener 
    static class TimePrinter implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            java.util.Date now = new java.util.Date(); // current date
            System.out.println("At the tone the time is " + now); // print 
            Toolkit.getDefaultToolkit().beep(); // system beep
        }
    }

    // main method
    public static void main(String[] args) {
        ActionListener listener = new TimePrinter(); 
        Timer t = new Timer(3000, listener);   // 3 000 ms 
        t.start(); 

        JOptionPane.showMessageDialog(null, "Stop beeping?"); 
        System.exit(0); 
    }
}