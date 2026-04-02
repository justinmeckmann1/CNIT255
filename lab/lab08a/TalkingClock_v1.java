/**
 * TalkingClock_V1.java
 * @author Justin Meckmann
 * Purpose: Implements a clock that prints the current time at a fixed interval using a Swinger Timer 
 *  Optionally plays a beep sound each time the time is printed.
 */



import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.awt.Toolkit;


public class TalkingClock_v1 {
    // fields
    private int interval; 
    private boolean beep; 

    // constructor 
    public TalkingClock_v1(int interval, boolean beep) {
        this.interval = interval; 
        this.beep = beep; 
    } 

    // start the timer
    public void start() {
        ActionListener listener = new TimePrinter();
        Timer t = new Timer(interval, listener);
        t.start();

    }

    // inner class 
    public class TimePrinter implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            // format time 
            String currentTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
            // print time 
            System.out.println("At the tone, the time is " + currentTime);

            //optional beep
            if (beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}


