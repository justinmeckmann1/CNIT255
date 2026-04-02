/**
 * InnerClassTest_v2.java
 * @author Justin Meckmann
 * Purpose: Test implementing the TalkingClock_V1 class by manually calling it
 */


import javax.swing.JOptionPane;

public class InnerClassTest_v2 {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        
        TalkingClock_v1 clock = new TalkingClock_v1(2000, true);

        // create inner class instance
        TalkingClock_v1.TimePrinter helper = clock.new TimePrinter();

        // manual call (prints once immediately)
        helper.actionPerformed(null);

        // start timer (prints repeatedly)
        clock.start();

        // message to quit
        JOptionPane.showMessageDialog(null, "Quit?");
        System.exit(0);
    }
}