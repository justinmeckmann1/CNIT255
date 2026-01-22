/**
* This program demonstrates how to access the MAX_VALUE
* of integers and tests the limits of floating-point numbers.
* @author Justin Meckmann
*/

public class VariableTypeTest {
    public static void main(String[] args) {
        // byte myByte = Byte.MIN_VALUE ; // modified to print the min value
        // short myShort = Short.MIN_VALUE;
        // int myInt = Integer.MIN_VALUE;
        // long myLong = Long.MIN_VALUE;
        float myFloat = 1.0000001f;
        double myDouble = 1.000000000000001;

        // truncate: drop everthing after the tenths value 
        myFloat = ((int) myFloat * 10) / 10;
        myDouble = ((int) myDouble * 10) / 10;

        // System.out.println(myByte);
        // System.out.println(myShort);
        // System.out.println(myInt);
        // System.out.println(myLong);
        System.out.println(myFloat);
        System.out.println(myDouble);

        // short result = myByte + myByte;


    }
}