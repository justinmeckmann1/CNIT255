package assertions.loggings;


public class FactorialCalculator {
/*To demonstrate how assertions can be triggered (evaluate to false), 
 * you can introduce an assertion that is intentionally designed to fail under certain conditions. 
 * For example, let's add testAssertionWithDirectCall()l method that will fail when n is specifically -1, 
 * just to show what happens when an assertion fails. This is purely for demonstration and 
 * not something you'd typically do in real code since assertions are meant to check for conditions 
 * that should logically always be true.*/
	
    public static void main(String[] args) {
        // Correct usage
        System.out.println("Factorial of 5: " + factorial(5)); //120

        // to test assertion failure internally 
        testAssertionWithDirectCall();
        
        //to demonstrate how to handle an exception publically
        try {
        	 factorial (-1); 
        } catch (IllegalArgumentException e) {
        	System.out.println("Must be a positive number!" );
        }
       
    }

    public static long factorial(int n) { //why not "throws ..."???
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        }
        return calculateFactorial(n);
    }

    private static long calculateFactorial(int n) {
        // This assertion will fail if calculateFactorial is called with a negative number
        assert n >= 0 : "Factorial calculation requires a non-negative integer";
        
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static void testAssertionWithDirectCall() {
        System.out.println("Testing assertion with a direct call to calculateFactorial(-1)");
        calculateFactorial(-1); // This call will trigger the assertion failure
    }
}


