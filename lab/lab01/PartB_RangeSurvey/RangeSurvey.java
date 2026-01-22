/**
 * RangeSurvey.java
 * @author Justin Meckmann
 * Purpose: Demonstrate built-in MIN_VALUE / MAX_VALUE constants.
 */

public class RangeSurvey {
    public static void main(String[] args) 
    {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString());


        System.out.println("byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        // TODO: print the range of short, int, long, float, and double.

        System.out.println("short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
    }
}