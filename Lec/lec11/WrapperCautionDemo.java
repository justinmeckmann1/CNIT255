
public class WrapperCautionDemo {
    public static void main(String[] args) {

        // Integer caching (-128 to 127)
        Integer a = 10; // reference type -> to cached int. 
        Integer b = 10; // reference type -> to cached int. 
        System.out.println(a == b);   // true (same cached object) --> reference the same cached object

        Integer c = 128;    
        Integer d = 128;
        System.out.println(c == d);   // false (different objects) not cached --> a and b are different references

        // Autounboxing + null
        Integer n = null;
        System.out.println(n + 1);    // throws NullPointerException
    }
}
