import java.util.Scanner;

/**
 * TextStatsDemo.java
 * @author Justin Meckmann
 * Purpose: Demonstrates how the Filter interface can be used to 
 *          analyze a input by applying different filter 
 *          conditions and counting instances using countMatches
 */

public class TextStatsDemo {
    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // get input from user
        System.out.println("Enter words to evaluate: ");

        Scanner scanner = new Scanner(System.in); 
        String line = scanner.nextLine(); 

        // split the words and save them to an array
        String[] words = line.split("\\s+");

        // implement new filter condition
        Filter<String> hasUppercase = new Filter<String>() {
            @Override
            public boolean test(String s) {
                for (int i = 0; i < s.length(); i++) {
                    if (Character.isUpperCase(s.charAt(i))) {
                        return true; 
                    }
                }
                return false; 
            }
        };

        // apply filter and count matches
        int upperCaseCount = hasUppercase.countMatches(words);
        int longerThanCount = Filter.longerThan(7).countMatches(words);
        
        // return analytics
        System.out.println("Words with uppercase letters: " + upperCaseCount);
        System.out.println("Words longer than 7 characters: " + longerThanCount);

        scanner.close();

    }
}
