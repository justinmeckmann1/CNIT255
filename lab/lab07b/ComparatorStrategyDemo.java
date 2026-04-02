import java.util.Arrays;
import java.util.Comparator;

/**
* ComparatorStrategyDemo.java
* @author Justin Meckmann
* Purpose:  Implementing two different compare methods (length and alphabetically) and 
            demonstrating their usage.
*/


public class ComparatorStrategyDemo {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // array 
        String[] words = {"elephant","cat","hippopotamus","dog","bee"};  

        // sort alphabertically 
        Arrays.sort(words, new AlphabeticalComparator());
        System.out.println("Alphabetical: " + Arrays.toString(words));

        // sort by length
        Arrays.sort(words, new LengthComparator());
        System.out.println("Length: " + Arrays.toString(words));
    }

    static class AlphabeticalComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return a.compareTo(b); // standard sorting -> alphabetically 
        }
    }

        static class LengthComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) { 
            // sorting by length
            if (a.length() < b.length()) return -1; 
            else if(a.length() > b.length()) return 1; 
            else return 0; // length is the same
        }
    }
}

