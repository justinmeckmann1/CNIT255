package assertions.loggings;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicLoggingExample {

	public static void main(String[] args) {
		Logger logger = Logger.getGlobal(); 
	    logger.info("File->Open menu item is selected"); 
	    logger.fine("menu item is selected");
	    
		logger.setLevel(Level.OFF); //logging is suppressed!
		logger.info("File->Open menu item is selected"); 
		
		System.out.println(System.getProperties()); 
		int numberOfSystemProperties = System.getProperties().size();
		System.out.println("Number of System Properties: " + numberOfSystemProperties);

	}

}
