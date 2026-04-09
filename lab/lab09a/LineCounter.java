import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;

/**
 * LineCounter.java
 * @author Justin Meckmann
 * Purpose: A program that counts the lines present in a file. 
 * Handles FileNotFoundException,  NoSuchFileException and IOException
 */

public class LineCounter {
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
        // try to read the lines from the file
        try (Stream<String> lines = Files.lines(p);) {
            // get line count and cast to type long
            long lineCount = (long) lines.count(); 
            lines.close();
            return lineCount;
        }
    }


}
