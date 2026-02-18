/**
* CopyVsClone.java 
* @author Justin Meckmann                 
* Purpose: Demonstrating the functionaly of copying vs cloning arrays
**/

import java.util.Arrays;

public class CopyVsClone {
    public static void main(String arg[]) {
        System.out.println("Username: " + System.getProperty("user.name"));
        System.out.println("Time: " + java.time.LocalDateTime.now().toString());
        
        // declare and initialize arrays
        int[] lucky = {3, 7, 13, 21, 34, 55};
        int[] alias = lucky;
        int[] clone = Arrays.copyOf(lucky, lucky.length);

        // Mutate alias[2]and clone[4]
        alias[2] = 99;
        clone[4] = 42;

        // print arrays
        System.out.println(
            "lucky = " + Arrays.toString(lucky) +
            "\nalias = " + Arrays.toString(alias) + 
            "\nclone = " + Arrays.toString(clone)
        );   
    }

}
