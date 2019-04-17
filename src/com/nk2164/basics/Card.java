package com.nk2164.basics;

public class Card {

	private final String face; // Any card. This includes the face cards and numbered cards.
	private final String suit; // Suit of card. 4 suits of 13 cards each (Club , Diamond , Heart , Spade).
	
	// Constructor to set cards face and suit.
	public Card(String face, String suit) {
		this.face = face;
		this.suit = suit;
	}
	
	// return string representation of card.
	public String toString() {
		return face + " of " + suit;
	}

}