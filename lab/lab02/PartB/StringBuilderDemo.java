/**
* StringBuilderDemo     
* @author Justin Meckmann                 
* Purpose: Modifying text with StringBuilder
*/

public class StringBuilderDemo {
    public static void main(String[] args) {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println("Username:  " + System.getProperty("user.name"));
        System.out.println("Timestamp: " + java.time.LocalDateTime.now().toString()+ "\n");

        StringBuilder sb = new StringBuilder("Hello"); 
        System.out.println("original: " + sb + " @" + System.identityHashCode(sb)); 

        sb.append(" there!"); 
        sb.append(" How are you?"); 
        
        System.out.println("modified: " + sb + " @" + System.identityHashCode(sb)); 


    }
}