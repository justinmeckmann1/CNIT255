/**
 * LambdaSortDemo.java
 * @author Justin Meckmann
 * Purpose: Implements a anonymous-class Comparator<String> to sort an array alpabetically 
 * and a one-line lambda expression to sort arrays by length
 */

import java.util.Arrays;
import java.util.Comparator;

public class LambdaSortDemo {

    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap


        // pets array
        String[] pets = {"iguana", "cat", "elephant", "bee", "dog"};


        // sorted alphabetically 
        // anonymous-class comperator<String> 
        Comparator<String> alphabeticComparator = new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return first.compareTo(second); // uses Comparable<String>
            }
        };

        Arrays.sort(pets, alphabeticComparator); 
        System.out.println(Arrays.toString(pets));

        // sorted by length 
        Arrays.sort(pets, (first, second) -> Integer.compare(first.length(), second.length()));
        System.out.println(Arrays.toString(pets));
    }
}



