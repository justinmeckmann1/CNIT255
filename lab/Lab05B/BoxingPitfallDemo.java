/**
* BoxingPitfallDemo.java 
* @author Justin Meckmann                 
* Purpose:  Class do demonstrate pros / cons of java autoboxing
**/





import java.util.ArrayList;

public class BoxingPitfallDemo {

    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap


        Integer a = 1000;
        Integer b = 1000;
        Integer c = null;


        System.out.println("a==b: " + (a == b));
        System.out.println("a.euqls(b): " + (a.equals(b)));

        try {
            int d = c; // --> nullpointer exception 
        }
        catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }

        ArrayList<Integer> numbers = new ArrayList<>();

        // add 3 and 4 
        numbers.add(3); 
        numbers.add(4); 

        // remove 3 by value
        numbers.remove(Integer.valueOf(3)); 

        // remove 3 by index 
        // numbers.remove(0); 

        System.out.println(numbers); 

    }
}