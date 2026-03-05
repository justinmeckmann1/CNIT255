import java.util.Scanner;

public class CoffeeTest {
    public static void main() {
        Scanner scanner = new Scanner(System.in); 
        String abbr; 


        System.out.printf("Enter a abbreviation: ");
        abbr = scanner.nextLine();

        CoffeeSize myCoffee = CoffeeSize.ofAbbreviation(abbr);

        if (myCoffee == null) {
            System.out.println("Abbreviation not found");
        }
        else {
            System.out.println(myCoffee.name() + " (" + myCoffee.getAbbreviation() + ") = "  + " mL");
        }

        scanner.close();
    }
}