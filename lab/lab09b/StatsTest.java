/**
 * StatsTest.java
 * @author Justin Meckmann
 * Purpose: Uses Stats class to calculate stats on an array
 * provided via the command line
 */

public class StatsTest {

    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        
        // only do if lenth is more than 0. Otherwise pass empty array to stat functions 
        // to test assertion
        int[] numbers;

        if (args.length > 0) {

            // convert command-line args to int array
            numbers = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numbers[i] = Integer.parseInt(args[i]);
            }
        }
        else {
            numbers = new int[0];
        }

        // calculate and print results
        double avg = Stats.average(numbers);
        int min = Stats.min(numbers);
        int max = Stats.max(numbers);

        // return results
        System.out.println("Average: " + avg);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}