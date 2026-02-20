public class SelectorExample {
    public static void main(int[] args) {
        // int selector = 1; 

        int selector = args[0] ;

        switch(selector) {
            case 1:
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
            default:
                break;
        }
    }
}
