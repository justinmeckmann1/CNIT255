/**
 * LineCounterWithBackup_Bonus.java
 * @author Justin Meckmann
 * Purpose: Extends LineCouter to count lines in a file 
 *  while creating a backup copy of its contents. 
 *  Uses try-with-recources statement to close Files
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class LineCounterWithBackup_Bonus extends LineCounter {
    // public method copied from LineCounter.java
     public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a filepath:");
        Path path = Paths.get(scanner.nextLine()); // get input and convert to type path
        scanner.close();

        // try catch to handle errors 
        try {
            long lines = countLines(path);
            System.out.println(lines + " lines");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + path);
        }
        catch (NoSuchFileException e) {
            System.out.println("No such file: " + path);
        }
        catch (IOException e ) {
            System.out.println("IO Error: " + e);
        }
    }
    public static long countLines(Path p) throws IOException {
        long lineCount = 0; // counter

        // try-with-recources --> automatically apply .close()
        try (Stream<String> lines = Files.lines(p);
             FileOutputStream out = new FileOutputStream("backup.txt")) {

            // convert stream to iterable for for-each loop
            for (String line : (Iterable<String>) lines::iterator) {
                // write each line to backup file
                out.write((line + "\n").getBytes());
                lineCount++;
            }
            return lineCount;
        } catch (IOException e) {
            e.printStackTrace();    // print error details
            throw e;                // throw (return) exception for handling
        }
    }
}