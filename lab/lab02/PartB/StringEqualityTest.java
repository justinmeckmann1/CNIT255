/**
* StringEqualityTest     
* @author Justin Meckmann                 
* Purpose: Illustrating immutability and the difference between == and equals. 
*/

public class StringEqualityTest {
    public static void main(String[] args) {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println("Username:  " + System.getProperty("user.name"));
        System.out.println("Timestamp: " + java.time.LocalDateTime.now().toString()+ "\n");

        String hello1 = "Hello"; 
        String hello2 = "Hello"; 
        String hello3 = new String("Hello"); 

        System.out.println("hello1 == hello2 : " + (hello1 == hello2)); 
        System.out.println("hello2 == hello3 : " + (hello2 == hello3)); 
        System.out.println("hello1.equals(hello3) : " + hello1.equals(hello3));     

        // Immutability demo 
        String copy = hello1; 
        hello1 += " there!"; // creates a NEW String 
        System.out.println("copy after modification: " + copy); 
        System.out.println("hello1 after modification: " + hello1); 

        System.out.println("copy reference : " + System.identityHashCode(copy)); 
        System.out.println("hello1 reference: " + System.identityHashCode(hello1)); 
    }
}