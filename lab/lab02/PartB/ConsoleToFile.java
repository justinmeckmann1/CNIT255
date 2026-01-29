/**
* ConsoleToFile     
* @author Justin Meckmann                 
* Purpose: Read user input from the console, transform it, and write it to a file
*/

import java.util.Scanner; 
import java.io.PrintWriter; 
import java.io.IOException; 
import java.nio.file.Paths; 

public class ConsoleToFile {
    public static void main(String[] args) throws IOException {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println("Username:  " + System.getProperty("user.name"));
        System.out.println("Timestamp: " + java.time.LocalDateTime.now().toString()+ "\n");

        Scanner in = new Scanner(System.in); 
        System.out.print("Enter a line of text: "); 
        String line = in.nextLine(); 
        if (line == null || line.length() == 0) { 
            System.out.println("No text entered - aborting."); 
            in.close();
            return; 
        } 
        String upper = line.toUpperCase(); 
        try (PrintWriter out = new PrintWriter("output.txt", "UTF-8")) { 
            out.println(upper); 
        } 
        System.out.println("Saved uppercase version to output.txt"); 

        in.close();

    }
}