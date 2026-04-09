/**
 * LineCounterWithBackup.java
 * @author Justin Meckmann
 * Purpose: Extends LineCouter to count lines in a file 
 *  while creating a backup copy of its contents.
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

public class LineCounterWithBackup extends LineCounter {
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
        Stream<String> lines = null;    // stream obj to read file 
        FileOutputStream out = null;    // output stream for output file
        long lineCount = 0;             // counter 

        try {
            lines = Files.lines(p); // open file
            out = new FileOutputStream("backup.txt"); // create backup file

            // convert stream to iterable for for-each loop
            for (String line : (Iterable<String>) lines::iterator) {
                // write each line to backup file
                out.write((line + "\n").getBytes());
                lineCount++; // increment counter
            }
            lines.close();  
            out.close();
            return lineCount;

        } catch (IOException e) {
            e.printStackTrace();             // print error details
            throw e;                         // throw (return) exception for handling

        } finally {
            // Close out if not closed yet
            if (out != null) out.close();
            if (lines != null) lines.close(); 
        }
    }
}




