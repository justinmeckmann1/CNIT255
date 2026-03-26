import java.util.Arrays;
import java.util.Comparator;

/**
* ComparatorStrategyDemo.java
* @author Justin Meckmann
* Purpose: <Explain what happens here!>     <-- #TODO
*/


public class ComparatorStrategyDemo {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap


        String[] words = {"elephant","cat","hippopotamus","dog","bee"};  

        Arrays.sort(words, new AlphabeticalComparator());
        System.out.println("Alphabetical: " + words);

        Arrays.sort(words, new LengthComparator());
        System.out.println("Length: " + words);

        

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
            if (a.length() < b.length()) return -1; 
            else if(a.length() > b.length()) return 1; 
            else return 0; // length is the same
        }
    }
}

