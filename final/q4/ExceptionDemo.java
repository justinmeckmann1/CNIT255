package q4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public static void main(String[] args) {

        // Part A: Checked exception -> try block 
        try {
            FileReader file = new FileReader("file.txt"); // nonexistent file
        } catch (FileNotFoundException e) {
            System.out.println("Checked exception caught");
        }

        // Part B: Unchecked exception
        try {
            int[] arr = {1, 2, 3};
            int x = arr[5]; // invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception caught");
        }

        // Program continues
        System.out.println("Program continues normally");
    }
}

/*
Reflective question: What is the main difference between a checked exception and an unchecked 
exception in Java?

Checked exceptions must be handled or declared at compile time, while unchecked exceptions occur at runtime and
are usually caused by programming errors. 
Checked exceptions represent conditions that a program can anticipate and recover from (e.g., by prompting a
user to retry), whereas unchecked exceptions indicate bugs in the code.

*/