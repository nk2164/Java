package com.nk2164.basics;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		DeckOfCards myDeck = new DeckOfCards(); // Create a deck of cards object
		myDeck.Shuffle();  // Shuffle cards
		
		// print all the cards in the order they are dealt
		
		for (int i=1;i <= 52;i++) {
			//deal and display a card
			System.out.printf("%-19s", myDeck.dealCard()); // "%-19s" - left justified field of 19 chars
			                                               // as a String. So toString() method is called.
			
			if (i % 4 == 0) {
				System.out.println(); //print a new line after display of 4 cards
			}
		}
	}

}
