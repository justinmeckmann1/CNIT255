/**
 * DeckTest.java
 * @author Justin Meckmann
 * Purpose: Test program for the Card and CardDeck classes.
 *          Creates a deck, shuffles it, draws several cards,
 *          and prints the state of the deck before and after drawing.
 */

package edu.cit255.cardgame;

public class DeckTest {
    public static void main(String args[]) {
        // print username and timestamp
        System.out.println(System.getProperty("user.name"));
        System.out.println(java.time.LocalDateTime.now().toString()); 
        System.out.println(); // line wrap

        // generate Deck
        CardDeck myDeck = new CardDeck(); 

        // Shuffle deck
        myDeck.shuffle();

        // return number of cards in deck: 
        System.out.println(myDeck);

        // draw three cards: 
        Card[] myCards = new Card[3]; 
        System.out.println("Drawing three cards:"); 
        for (int i = 0; i < 3; i++) {
            myCards[i] = myDeck.draw();
            System.out.println("  " + myCards[i]); 
        }

        // return number of cards in deck: 
        System.out.println(myDeck);
    }
}
