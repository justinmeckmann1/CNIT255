/**
 * Stats.java
 * @author Justin Meckmann
 * Purpose: Stats class. Implements three methods to calculate average,
 * min and max for an array and uses assertion to test wether outputs are valid
 */

public class Stats {
    // average method
    public static double average(int[] a) {
        // check if input array is valid
        assert a != null && a.length > 0 : "Array cannot be null or empty";
        double sum = 0; 

        for (int i : a) {
            sum += i; 
        }

        double avg = (double) sum / a.length;

        // verify avg is between min and max
        int min = min(a);
        int max = max(a);

        // verify that 
        assert avg >= min && avg <= max : "Average not within min and max";

        return (double) sum / a.length; 
    }

    public static int min(int[] a) {
        // check if input array is valid
        assert a != null && a.length > 0 : "Array cannot be null or empty";

        int min = a[0];
        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int max(int[] a) {
        // check if input array is valid
        assert a != null && a.length > 0 : "Array cannot be null or empty";

        int max = a[0];
        for (int i : a) {   
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}
