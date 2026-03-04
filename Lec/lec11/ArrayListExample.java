import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<>();

        alist.add("Steve");
        alist.add("Tim");
        alist.add("Lucy");
        alist.add("Pat");
        alist.add("Angela");
        alist.add("Tom");

        System.out.println(alist);
        alist.add(3, "Cho");
        System.out.println(alist);
        String name = alist.get(2);
        System.out.println("Index 2 in the list: " + name);
        alist.set(2, "Harry");
        System.out.println(alist);

        // alist.add(100);  --> cast it to string!
        // System.out.println(alist);
    }
}