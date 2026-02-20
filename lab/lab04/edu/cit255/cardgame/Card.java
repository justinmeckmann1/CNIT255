/**
 * Card.java
 * @author Justin Meckmann
 * Purpose: A single playing card class defined by a value and a suit.
 *          Provides a string representation of the card (e.g., "Ace of Spades")
 *          by mapping numeric values and suits to human-readable names.
 */


package edu.cit255.cardgame;

public class Card {
    private final int value;
    private final int suit;

    private static String[] values = {
        "Ace", "2", "3", "4", "5", "6", "7",
        "8", "9", "10", "Jack", "Queen", "King"
    };

    private static String[] suits = {
        "Hearts", "Diamonds", "Clubs", "Spades"
    };

    // constructor -> save values
    public Card(int value, int suit) {
        this.value = value;
        this.suit = suit;
    }

    // toString method 
    @Override
    public String toString() {
        return String.format(
            "%s of %s", 
            Card.values[this.value-1],  // map according value string 
            Card.suits[this.suit-1]     // map according suit string 
        );
    } 
}
