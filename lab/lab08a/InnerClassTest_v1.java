/**
 * InnerClassTest_v1.java
 * @author Justin Meckmann
 * Purpose: Test implementing the TalkingClock_V1 class 
 */


import javax.swing.JOptionPane;

public class InnerClassTest_v1 {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap


        TalkingClock_v1 clock = new TalkingClock_v1(2000, true); 
        clock.start();
        JOptionPane.showMessageDialog(null, "Quit?");
    }
}
