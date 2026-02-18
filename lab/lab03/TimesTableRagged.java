/**
* TimesTableRagged.java 
* @author Justin Meckmann                 
* Purpose: Using a ragged 2D array to compute a Times Table
**/

import java.util.Scanner;

public class TimesTableRagged {
    public static void main(String args[]) {
        System.out.println("Username: " + System.getProperty("user.name"));
        System.out.println("Time: " + java.time.LocalDateTime.now().toString());
        
        System.out.printf("Please enter an integer m (1 ≤ m ≤ 12): "); 
        Scanner in = new Scanner(System.in);    // initialize scanner
        int m = in.nextInt();                   // read input


        int[][] myArray = new int[m][];         // initialize array
        for (int i = 0; i < m; i++) {           // populate array using nested for loops
            myArray[i] = new int[i+1]; 
            for (int j = 0; j < i+1; j++) {
                myArray[i][j] = (i+1) * (j+1);  // calculate the values
            }
        }

        // print by iterating over array using nested for loops
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) 
                System.out.printf("%d ",myArray[i][j]);
            System.out.printf("\n"); // line break after one line is complete
        }
        
        in.close(); // close scanner
    }
}
