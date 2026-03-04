

enum Color {
    RED, BLUE
}

public class EnumCompareDemo {
    public static void main(String[] args) {

        Color c1 = Color.RED;
        Color c2 = Color.RED;
        Color c3 = Color.BLUE;

        System.out.println(c1 == c2);      // true
        System.out.println(c1.equals(c2)); // true
        System.out.println(c1 == c3);      // false
        System.out.println(c1.equals(c3)); // false
    }
}
