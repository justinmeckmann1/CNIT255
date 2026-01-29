/**
* StringOps.java.                
* @author Justin Meckmann                 
* Purpose: Demonstrating fundamental operations on one string literal
*/

public class StringOps {
    public static void main(String[] args) {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println("Username:  " + System.getProperty("user.name"));
        System.out.println("Timestamp: " + java.time.LocalDateTime.now().toString()+ "\n");

        String greeting = "Hello, World!"; 
            
        System.out.println("Original: " + greeting); 
        System.out.println("Upper case: " + greeting.toUpperCase()); 
        System.out.println("Substring (0-5): " + greeting.substring(0, 5)); 
        System.out.println("Length (code units): " + greeting.length()); 
        int cp = greeting.codePointCount(0, greeting.length()); 
        System.out.println("Length (code points): " + cp); 
        String joined = String.join(" / ", "S", "M", "L", "XL"); 
        System.out.println("Joined sizes: " + joined); 
    }
}