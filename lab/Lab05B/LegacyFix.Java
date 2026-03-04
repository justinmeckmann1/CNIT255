/**
* LegacyFix.java
* @author Justin Meckmann
* Purpose: Demonstrates how to safely copy legacy raw ArrayList 
*          to a more modern List
*/


import java.util.ArrayList;
import java.util.List;

public class LegacyFix {

    @SuppressWarnings("unchecked")
    public static ArrayList getLegacyNames() {
        ArrayList list = new ArrayList();
        list.add("Ada");
        list.add("Grace");
        return list;
    }

    public static void main(String[] args) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // call legacy method
        ArrayList legacy = getLegacyNames();

        // new ArrayList
        List<String> modern = new ArrayList<>();

        // parse items of legacy list and typecast them to the datatype of the modern list
        for (Object item : legacy) {
            modern.add((String) item);
        }

        // Add new name
        modern.add("Linus");

        // Print all names
        for (String name : modern) {
            System.out.println(name);
        }
    }
}

