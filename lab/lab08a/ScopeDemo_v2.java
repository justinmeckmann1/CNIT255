/**
 * ScopeDemo_v2.java
 * @author Justin Meckmann
 * Purpose: modifying a local variable inside a lambda expression, 
 * using wrapper classes
 */




import java.util.List;

public class ScopeDemo_v2 {
    public static void main(String[] args) { // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        
        List<Integer> nums = java.util.Arrays.asList(1, 2, 3, 4, 5);

        java.util.concurrent.atomic.AtomicInteger sum = new
        java.util.concurrent.atomic.AtomicInteger(0);

        // add sum using addAndGet (Atomically adds the given value to the current value)
        nums.forEach(n -> sum.addAndGet(n));

        System.out.println("Sum: " + sum);
    }
}
