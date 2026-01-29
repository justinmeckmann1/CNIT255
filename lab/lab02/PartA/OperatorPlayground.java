/**
* OperatorPlayground.java.          
* @author Justin Meckmann                
* Purpose: Shows results of each arithmetic operator on two integers. 
*/

public class OperatorPlayground {
    public static void main(String[] args) {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()+ "\n");

        if (args.length != 2) { 
            System.out.println("Usage: java OperatorPlayground <int a> <int b>"); 
            return; 
        } 

        int a = Integer.parseInt(args[0]); 
        int b = Integer.parseInt(args[1]); 

        System.out.println("a = " + a + ", b = " + b); 
        System.out.println("a + b = " + (a + b)); 
        System.out.println("a - b = " + (a - b)); 
        System.out.println("a * b = " + (a * b)); 
        System.out.println("a / b = " + (a / b)); // integer division 
        System.out.println("a % b = " + (a % b)); // remainder 

        // compound and increment / decrement samples 
        int x = a; 
        x += b; System.out.println("x += b → " + x); 
        x *= 2; System.out.println("x *= 2 → " + x); 
        System.out.println("++x    → " + (++x)); 
        System.out.println("x--    → " + (x--)); 
        System.out.println("x after post-decrement → " + x); 

    }
}