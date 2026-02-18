/**
* TempStats.java 
* @author Justin Meckmann                 
* Purpose: Read max temperatures from user and compute simple statistics
**/

import java.util.Arrays;
import java.util.Scanner;

public class TempStats {
    public static void main(String args[]) {
        System.out.println("Username: " + System.getProperty("user.name"));
        System.out.println("Time: " + java.time.LocalDateTime.now().toString());

        Scanner in = new Scanner(System.in); 

        System.out.printf("Please enter the number of days to track: "); 
        int n = in.nextInt(); 
        int[] temps = new int[n]; // create empty 1D array with the size n
        
        // get temperature inputs 
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter the daily high for day "+ (i+1)+": ");
            temps[i] = in.nextInt(); 
        }

        in.close(); // close the scanner 

        // init min, max, sum and average
        int min = temps[0];  // assign first value of array
        int max = temps[0];  // assign first value of array
        int sum = temps[0];  // assign first value of array
        double avg;

        for (int i = 1; i < n; i++) {
            if (temps[i] < min)
                min = temps[i];  // change min, if temps[i] is smaller then current min
            if (temps[i] > max) 
                max = temps[i]; // change max, if temps[i] is larger then current max

            sum += temps[i]; // add to sum
        }  
        
        avg = (double) sum / n; // calculate average

        // print results
        System.out.println(
            "\nHighs: " + Arrays.toString(temps) +
            "\nMin = " + min + ", Max = " + max + ", Avg = " + avg
        );
        
    }
}
