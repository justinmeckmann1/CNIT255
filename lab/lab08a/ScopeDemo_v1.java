/**
 * ScopeDemo_v1.java
 * @author Justin Meckmann
 * Purpose: Attempts to modify a local variable inside a lambda expression, 
 * demonstrating that variables must be final or effectively final.
 */




import java.util.List;

public class ScopeDemo_v1 {
    public static void main(String[] args) { 
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        
        // --> java.util.List produces a  warning: References to generic type List<E> should be parameterizedJava
        // java.util.List nums = java.util.Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> nums = java.util.Arrays.asList(1, 2, 3, 4, 5);
        int sum = 0;

        nums.forEach(n -> sum += n); 
    }
}
