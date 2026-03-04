
import java.util.ArrayList;

public class LegacyCodeArrayListExample {
    public static void main (String[] args) {
        ArrayList<String> names = (ArrayList<String>) getLegacyArrayList();
        for(String name: names) {
            System.out.println(name);
        }
    }

    public static ArrayList getLegacyArrayList() {
        ArrayList list = new ArrayList();
        list.add("Alice");
        list.add("Bob");
        list.add(3); //no compile-time error
        return list;
    }
}
