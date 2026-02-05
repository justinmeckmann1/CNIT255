import java.util.Scanner;

/**
* TempStats.java 
* @author Justin Meckmann                 
* Purpose: ...
*/



public class TempStats {
    public static void main(String args[]) {
        System.out.println("Username: " + System.getProperty("user.name"));
        System.out.println("Time: " + java.time.LocalDateTime.now().toString());

        Scanner in = new Scanner(System.in); 

        System.out.println("Please enter the number of days to track: "); 
        int choice = in.nextInt(); 
        in.close();
    }
}
