/**
* <FILENAME>.java.                          <-- #TODO
* @author Justin Meckmann                   <-- #TODO
* Purpose: <Explain what happens here!>     <-- #TODO
*/

public class PromotionPuzzle_v1 {
    public static void main(String[] args) {
        // Always include these two lines in all your assignments that require screenshots
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()+ "\n");

        int big = 1_000_000; 
        int resultWrong = big * big; // overflow in int BEFORE assignment 
        long stillWrong = big * big; 
        long resultRight = 1L * big * big; // forces long math FIRST 

        System.out.println("wrong (int): " + resultWrong); 
        System.out.println("still wrong (long): " + stillWrong); 
        System.out.println("correct(long): " + resultRight); 
    } 
} 