/**
 * InnerClassTest_v3.java
 * @author Justin Meckmann
 * Purpose: Test implementing the TalkingClock_v2 class --> showing identical behavior  
 */


import javax.swing.JOptionPane;

public class InnerClassTest_v3 {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap


        TalkingClock_v2 clock = new TalkingClock_v2(2000, true); 
        clock.start();
        JOptionPane.showMessageDialog(null, "Quit?");
    }
}