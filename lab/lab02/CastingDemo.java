/**
* CastingDemo.java 
* @author Justin Meckmann                 
* Purpose: Demonstrates automatic upcasting and explicit downcasting. 
*/

public class CastingDemo { 
    public static void main(String[] args) { 
        // Always include these two lines in all your assignments that require screenshots
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()+ "\n");

        // Automatic (widening) conversions 
        int iVal = 1134; 
        double dFromInt = iVal;            
        System.out.println("automatic: " + dFromInt); 

        byte bVal = 12; 
        int iFromByte = bVal;             // byte -> int 
        System.out.println("automatic: " + iFromByte); 

        // Explicit (narrowing) conversions – risk of data loss 
        double bigDouble = 9.997; 
        int iTruncated = (int) bigDouble; // loses decimals 
        System.out.println("explicit (double->int): " + iTruncated); 

        long bigLong = 100000L; 
        short sCrashed = (short) bigLong; // overflow 
        System.out.println("explicit (long->short): " + sCrashed); 

        // TODO: Add 3 more examples of explicit casts that change value. 
    } 
} 