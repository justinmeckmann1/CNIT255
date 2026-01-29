public class StringImmutableTest {
    public static void main(String[] args) {

        String original = "Hello";
        System.out.println("original string: " + original);
        String temp = original; //references are copied!
        System.out.println("original reference: " + System.identityHashCode(temp));
        System.out.println("temp reference: " + System.identityHashCode(temp));
        original = original + " There!"; //original modified
        System.out.println("modified original string: " + original);
        System.out.println("temp string modified? " + temp); // not modified
        System.out.println("original reference: " + System.identityHashCode(original));
        System.out.println("temp reference: " + System.identityHashCode(temp));

    } //end main
} //end class