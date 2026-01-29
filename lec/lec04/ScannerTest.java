import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int integerEntered = input.nextInt();
        System.out.println("User entered: " + integerEntered);
        input.close();
    
    }
}
