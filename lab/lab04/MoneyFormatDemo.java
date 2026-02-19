/**
* BankAccount.java 
* @author Justin Meckmann                 
* Purpose: Takes a price and discount in as inputs and prints: 
    - Formatted price
    - Formatted discount
    - Amount saved
    - Final price 
**/

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;


public class MoneyFormatDemo {
    public static void main(String[] args) {
        // Identification and Timestamp
        String username = System.getProperty("user.name");
        String time = java.time.LocalDateTime.now().toString();
        System.out.println(username);
        System.out.println(time);

        System.out.println(); // new line
        
        double price, discount, saved, priceDiscounted;
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Price in USD: ");
        price = scanner.nextDouble(); 

        System.out.print("Discount percent (e.g., 15 for 15%): ");
        discount = scanner.nextDouble();
        discount = discount / 100; // convert to decimal 
        saved = price * discount; 
        priceDiscounted = price - saved; 


        // obtain NumberFormat objects
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);// Locale.US sets the region (i.e. currency to USD)
        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        currencyFormat.setMinimumFractionDigits(2); 
        percentFormat.setMinimumFractionDigits(0);

        System.out.println("\nPrice: " + currencyFormat.format(price)); 
        System.out.println("Discount: " + percentFormat.format(discount)); 
        System.out.println("You save: " + currencyFormat.format(saved)); 
        System.out.println("Final price: " + currencyFormat.format(priceDiscounted)); 

        scanner.close();

    }


}