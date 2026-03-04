

import java.util.ArrayList;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // raw ArrayList

        list.add("Hello");   // String
        list.add(100);       // Integer

        String a = (String) list.get(0); // OK
        System.out.println(a);

        String b = (String) list.get(1); // Runtime error
        System.out.println(b);
    }
}