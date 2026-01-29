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
        // int -> double is widening: 1134 can be represented exactly as a double, so value stays 1134.0
        int iVal = 1134; 
        double dFromInt = iVal;            
        System.out.println("automatic: " + dFromInt); 

        // Automatic (widening) conversions 
        // byte -> int is widening: 12 fits in int, so value stays 12
        byte bVal = 12; 
        int iFromByte = bVal;             
        System.out.println("automatic: " + iFromByte); 

        // Explicit (narrowing) conversions – risk of data loss 
        // int cannot represent non whole numbers, so that part after the decimal point is truncated (dropped)
        double bigDouble = 9.997; 
        int iTruncated = (int) bigDouble; // loses decimals 
        System.out.println("explicit (double->int): " + iTruncated); 

        // max value of short is 32767 which is less than 100000. Therefore there is an overflow error
        long bigLong = 100000L; 
        short sCrashed = (short) bigLong; // overflow 
        System.out.println("explicit (long->short): " + sCrashed); 
        
        // float to byte: 
        // byte cannot represent decimal numbers, so everything after the decimal point is dropped which results in 130
        // The max value of byte is 127, which is less than 130, which then results in an overflow error
        float fVal = 130.75f;
        byte bFromFloat = (byte) fVal;
        System.out.println("explicit (float->byte): " + bFromFloat);

        // int to char: the corresonding ascii character for the number (e.g. 65 -> A, 66 -> B) is returned
        int iCharVal = 65;
        char cFromInt = (char) iCharVal; 
        System.out.println("explicit (int->char): " + cFromInt);

        // double to byte: 
        // same as float to byte: truncated and overflow error. All bits but the lowest 8 are dropped
        double dVal = 258.9;
        byte bFromDouble = (byte) dVal; 
        System.out.println("explicit (double->byte): " + bFromDouble);
        
    } 
} 