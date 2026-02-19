package edu.cit255.cardgame;

import java.util.Arrays;
import java.util.Collections;

public class CardDeck {
    private Card[] cards; // array of cards

    private static int numValues = 13; 
    private static int numSuits = 4; 
    private int cardsRemaining = numValues * numSuits; // number of cards remaining in the stack

    // constructor -> builds a deck of 52 cards
    public CardDeck() {
        int index = 0;
        cards = new Card[numValues * numSuits];

        for (int i = 0; i < numValues; i++) {
            for (int j = 0; j < numSuits; j++) {
                cards[index++] = new Card(i+1, j+1);
            }
        } 
    }

    // shuffle the deck 
    public void shuffle() {
        Collections.shuffle(Arrays.asList(this.cards));
    }

    // draw the next card in the stack and remove it from the stack
    public Card draw() {
        return cards[this.cardsRemaining-- -1]; 
    }

    // peek the next card in the stack  
    public Card peekTop() {
        return cards[this.cardsRemaining-1]; 
    }

    // return string 
    @Override
    public String toString() {
        return String.format("Deck with %d cards remaining", cardsRemaining);
    }
}

