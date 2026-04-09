package assertions.loggings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.*;


/*A modification of the image viewer program that logs various events. @author Cay Horstmann
 * 
 * This program is a practical demonstration of integrating Java's logging system 
 * with a Swing GUI application, showcasing how logging can be adapted for various output destinations
 *  and used to monitor the flow and actions within an application.*/

/*The main class that starts the application. It sets up logging (file logging and window logging) 
 * before initializing the GUI part of the application (ImageViewerFrame). 
 * This class checks for existing logging configuration and, if absent, programmatically configures logging 
 * to write to a file and a custom window.*/
public class LoggingImageViewer {
	/*LoggingImageViewer
	 * Main Method Setup: Checks if logging configuration is specified; if not, it sets the logging level for the logger named 
	 * "com.horstmann.corejava" to ALL, allowing all log messages to be processed. It then sets up a FileHandler to write logs 
	 * to a file with a rotation count, catching any IOException that may occur during setup.
	 *  GUI Initialization in Event Queue: Encapsulates GUI initialization within EventQueue.invokeLater to ensure thread safety 
	 *  for Swing components. It creates a WindowHandler for logging to a window, sets its level, and adds it to the 
	 *  "com.horstmann.corejava" logger. Then, it initializes ImageViewerFrame, sets its title, default close operation, 
	 *  logs the action of showing the frame, and makes the frame visible.*/
	public static void main(String[] args) {
		if (System.getProperty("java.util.logging.config.class") == null 
				&& (System.getProperty("java.util.logging.config.file") == null)) {
				try {
					Logger.getLogger("com.horstmann.corejava").setLevel(Level.ALL); 
					final int LOG_ROTATION_COUNT = 10;
					Handler handler = new FileHandler("%h/LoggingImageViewer.log", 0, LOG_ROTATION_COUNT); 
					Logger.getLogger("com.horstmann.corejava").addHandler(handler); 
					
				} catch (IOException e) {
					Logger.getLogger("com.horstmann.corejava").log(Level.SEVERE, 
							"Can't create log file handler", e); 
				}
		}
		
		EventQueue.invokeLater( () -> {
			Handler windowHandler = new WindowHandler(); 
			windowHandler.setLevel(Level.ALL); 
			Logger.getLogger("com.horstmann.corejava").addHandler(windowHandler); 
			
			JFrame frame = new ImageViewerFrame(); 
			frame.setTitle("LoggingImageViewer"); 
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			
			Logger.getLogger("com.horstmann.corejava").fine("Showing frame"); 
			frame.setVisible(true); 		
		}); 
	}
}

/* The frame that shows the image. Extends JFrame to create the application's main window. 
 * It includes a menu with options to open an image file (specifically, .gif files) and exit the application. 
 * Actions within this frame, such as opening a file, are logged using the logging system initialized in LoggingImageViewer.*/
class ImageViewerFrame extends JFrame {
/*ImageViewerFrame
 * Constructor: Logs entry into the constructor, sets the frame's size, initializes the menu bar along with "File" menu items 
 * for opening and exiting, assigns an action listener to these items, and finally, logs exiting the constructor.
 * FileOpenListener: An inner class implementing ActionListener for handling file open actions. 
 * It displays a file chooser dialog, filters for .gif images, and upon selection, 
 * sets the chosen image as an icon to a label within the frame. 
 * Logging is used throughout to track actions and outcomes.*/
	private static final int DEFAULT_WIDTH = 300; 
	private static final int DEFAULT_HEIGHT = 400; 
	private JLabel label; 
	private static Logger logger = Logger.getLogger("com.horstmann.corejava"); 
	
	public ImageViewerFrame() {
		logger.entering("ImageViewerFrame",  "<init>");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT); 
		
		//set up menu bar
		JMenuBar menuBar = new JMenuBar() ;
		setJMenuBar(menuBar); 
		
		JMenu menu = new JMenu("File"); 
		menuBar.add(menu); 
		
		JMenuItem openItem = new JMenuItem("Open"); 
		menu.add(openItem); 
		openItem.addActionListener(new FileOpenListener());
		
		JMenuItem exitItem = new JMenuItem("Exit"); 
		menu.add(exitItem); 
		exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				logger.fine("Exiting.");
				System.exit(0);; 
			}
		}); 
		
		
		//use a label to display the images
		label = new JLabel(); 
		add(label); 
		logger.exiting("ImageViewerFrame", "<init>"); 
		
	}
	
	private class FileOpenListener implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent event) {
			logger.entering("ImageViewerFrame.FileOpenListener", "actionPerformed", event); 
			
			//set up file chooser
			JFileChooser chooser = new JFileChooser(); 
			chooser.setCurrentDirectory(new File(".")); 
			
			//accept all files ending with .gif
			chooser.setFileFilter(new javax.swing.filechooser.FileFilter() {

				@Override
				public boolean accept(File f) {
					return f.getName().toLowerCase().endsWith(".gif") || f.isDirectory(); 
				}

				@Override
				public String getDescription() {
					
					return "GIF Images";
				}
				
			}); 
			
			//show file chooser diaglog
			int r = chooser.showOpenDialog(ImageViewerFrame.this); 
			
			//if image file accepted, set it as icon of the label
			if(r == JFileChooser.APPROVE_OPTION) {
				String name = chooser.getSelectedFile().getPath(); 
				logger.log(Level.FINE, "Reading file {0}", name);
				label.setIcon(new ImageIcon(name));
			}
			else logger.fine("File open dialog canceled.");
			logger.exiting("ImageViewerFrame.FileOpenListener", "actionPerformed"); 
		}		
	}
}

/* Extends StreamHandler, a part of Java's logging framework, to direct log messages to a window (JFrame)
 *  instead of a console or file. This custom handler shows log messages in a text area within a separate window.*/
class WindowHandler extends StreamHandler {
	/*WindowHandler
	 * Constructor: Initializes a frame for logging output, sets up a non-editable JTextArea within a scroll pane 
	 * as the output destination for log messages, and makes the frame visible. 
	 * Overridden write Method: Implements a custom write method to append log messages to the text area,
	 *  converting bytes to a string.
	 *  Overridden publish Method: Ensures log messages are displayed in the text area only if the frame is visible, 
	 *  calling super.publish(record) to process the log message and flush() to ensure it's displayed immediately.*/
	private JFrame frame; 
	
	public WindowHandler() {
		frame = new JFrame(); 
		final JTextArea output = new JTextArea(); 
		output.setEditable(false);
		frame.setSize(200, 200); 
		frame.setVisible(true);
		frame.add(new JScrollPane(output)); 
		frame.setFocusableWindowState(true);
		setOutputStream(new OutputStream() {
			/*The code snippet you provided is indeed an example of an anonymous inner class in Java. 
			 * It creates an anonymous subclass of OutputStream and overrides its methods to provide specific functionality. 
			 * In this case, the anonymous class overrides the write(int b) and write(byte[] b, int off, int len) methods of OutputStream.
			 * Using an anonymous inner class here is necessary because OutputStream is an abstract class 
			 * with multiple abstract methods that potentially need to be implemented. While your comment suggests 
			 * that write(int b) is not used, it still must be implemented to fulfill the contract of the abstract OutputStream class.
			 * 
			 * 
			 * Lambda expressions in Java are succinct and powerful, but they have their limitations. One such limitation is 
			 * that they can only be used to implement interfaces with a single abstract method (SAM interfaces), 
			 * commonly referred to as functional interfaces. Since OutputStream requires implementing more than one abstract method, 
			 * a lambda expression cannot be directly used as a substitute for an anonymous inner class in this context.
			 * 
			 * Your code provides a custom implementation for write(byte[] b, int off, int len) to append the given bytes as a string
			 *  to a JTextArea. The write(int b) method is also overridden but left empty, as it's required 
			 *  but not used in your specific use case. This design pattern allows for direct and efficient handling of byte streams 
			 *  within GUI components, enabling dynamic logging or data display within the application's user interface.*/

			@Override
			public void write(int b) throws IOException {
				//this method is not used but you need it  because of OutputStream
			}
			
			public void write(byte[] b, int off, int len) {
				output.append(new String(b, off, len)); 
			}
			
		}); 
	}	
		@Override
		public void publish(LogRecord record) {
			if (!frame.isVisible()) return; 
			super.publish(record);
			flush(); 
		}
	}

