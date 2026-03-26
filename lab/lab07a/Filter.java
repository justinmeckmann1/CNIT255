/**
 * Filter.java
 * @author Justin Meckmann
 * Purpose: Defines a filter interface with a abstract test method 
 *          and countMatches to count instances that math condiation
 *          implements a longterThan filter using the test method.
 */


@FunctionalInterface
public interface Filter<T> {

    // abstract test method
    abstract boolean test(T t);

    // count matches. method
    default int countMatches(T[] data) {
        int count = 0; 
        for (T t : data) {
            if (test(t)) {
                count += 1; 
            }
        }
        // return number of items that meet the criteria specified in test
        return count;
    }

    // longerThan filter using test method
    static Filter<String> longerThan(int n) {
        return new Filter<String>() {
            // Override previously defined abstract test
            @Override
            public boolean test(String t) {
                if (t.length() > n) return true;
                else return false; 
            }
        };
    }
}