/**
* OverflowUnderflowTest.java
* @author <Your Name>
* Purpose: Shows what happens when you exceed the limits of all integer types.
*/
public class OverflowUnderflowTest {
    public static void main(String[] args) {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()+ "\n");


        // TODO: print the examples overflow and underflow for byte, short, int, long, float, and double.
        // To do so, you must first correctly declare data types and variables.
        // 1) the MAX / MIN value of the datatype is assigned using MAX_VALUE / MIN_VALUE. Then, this value is decreased or increased
        // in order to provpke the under or overflow

        // byte
        // overflow 
        byte b = Byte.MAX_VALUE;
        System.out.println("byte before overflow: " + b);
        b++; // wraps to −128
        System.out.println("byte after overflow: " + b);
        
        // underflow 
        b = Byte.MIN_VALUE;
        System.out.println("byte before underflow: " + b);
        b--; // wraps to 127
        System.out.println("byte after underflow: " + b + "\n");


        // short 
        // overflow 
        short s = Short.MAX_VALUE;
        System.out.println("short before overflow: " + s);
        s++; // wraps to −128
        System.out.println("short after overflow: " + s);
        
        // underflow 
        s = Short.MIN_VALUE;
        System.out.println("short before underflow: " + s); 
        s--; 
        System.out.println("short after underflow: " + s+ "\n"); 

        // int
        // overflow 
        int i = Integer.MAX_VALUE; 
        System.out.println("int before overflow: " + i);
        i++; 
        System.out.println("int after overflow: " + i); 
        
        // underflow 
        i = Integer.MIN_VALUE; 
        System.out.println("int before underflow: "+ i); 
        i--; 
        System.out.println("int after underflow: "+ i+ "\n"); 

        // long
        // overflow
        long l = Long.MAX_VALUE; 
        System.out.println("long before overflow: " + l);
        l++; 
        System.out.println("long after overflow: "+ l);

        // underflow 
        l = Long.MIN_VALUE; 
        System.out.println("long before underflow: " + l );
        l --; 
        System.out.println("long after underflow: " + l + "\n");

        

        // float 
        // overflow
        float f = Float.MAX_VALUE; 
        System.out.println("float before underflow; " + f);
        f *= f; 
        System.out.println("float after underflow; " + f);
        
        // underflow
        f = Float.MIN_VALUE; 
        System.out.println("float before underflow; " + f);
        f /= f; 
        System.out.println("float after underflow; " + f + "\n");


        // double 
        // overflow
        double d = Double.MAX_VALUE; 
        System.out.println("double before underflow; " + d);
        d *= d; 
        System.out.println("double after underflow; " + d);
        
        // underflow
        d = Double.MIN_VALUE; 
        System.out.println("double before underflow; " + d);
        d /= d; 
        System.out.println("double after underflow; " + d + "\n");

    }
}