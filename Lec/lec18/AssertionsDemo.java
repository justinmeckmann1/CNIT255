package assertions.loggings;


/**
 * Demo of assertions vs. ordinary argument checking.
 *
 *   safeSqrt(double x)     – an internal helper that should never see x < 0
 *   publicSqrt(double x)   – a public API that must check user input
 *
 *   Run with:   java AssertionsDemo  9
 *   Turn on     java -ea AssertionsDemo  -9
 */
public class AssertionsDemo {

    // 1. INTERNAL INVARIANT — use assertion
    private static double safeSqrt(double x) {
        // If our own code ever passes a negative value, we want to know immediately.
        assert x >= 0 : "Bug: safeSqrt called with x = " + x;
        return Math.sqrt(x);
    }

    // 2. PUBLIC METHOD — use an explicit check & exception
    public static double publicSqrt(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("publicSqrt: x must be >= 0");
        }
        return safeSqrt(x);
    }

    public static void main(String [] args) {
        if (args.length == 0) {
            System.out.println("Usage: java [-ea] AssertionsDemo <number>");
            return;
        }

        double x = Double.parseDouble(args[0]);
        System.out.println("square root of x = " + publicSqrt(x));
    }
}

