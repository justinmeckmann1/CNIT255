package assertions.loggings;

import java.io.*;
import java.util.logging.*;

public class FileReaderDemo {
    private static final Logger logger =
            Logger.getLogger(FileReaderDemo.class.getName());

    public static void main(String[] args) {

     System.out.println("Working dir = " + System.getProperty("user.dir"));
        try {
            readFile("reports/summary.txt");
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Failed to read file", e);
        }
    }


    public static void readFile(String path) throws IOException {
        logger.info("Attempting to read file: " + path);

        File file = new File(path);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + file.getAbsolutePath());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            logger.info("File opened successfully");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
