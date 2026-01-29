/**
* PromotionPuzzle_v2.java.          
* @author Justin Meckmann                
* Purpose: Proving overflow for a mixed-type expression (float -> double)
*/

public class PromotionPuzzle_v2 {
    public static void main(String[] args) {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()+ "\n");

        Float big = (float) 1.0E20; 
        Float resultWrong = big * big; // overflow in BEFORE assignment 
        double stillWrong = big * big; 
        double resultRight = 1d * big * big; // adding 1d forces double math 

        System.out.println("wrong (float): " + resultWrong); 
        System.out.println("still wrong (double): " + stillWrong); 
        System.out.println("correct(double): " + resultRight);  
    } 
} 