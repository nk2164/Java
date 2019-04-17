package com.nk2164.basics;

import java.security.SecureRandom;

public class DeckOfCards {
	private static final SecureRandom randomNumbers = new SecureRandom(); // Random number generator
	private static final int NUMBER_OF_CARDS = 52; // number of cards

	private Card[] deck; // array of card objects.
	private int currentCard; // index of the next card to be dealt (0 - 51)
	
	//Constructor fills the deck of cards.
	public DeckOfCards() {
		String[] faces = {"Ace","Deuce","Three","Four","Five","Six",
						  "Seven","Eight","Nine","Ten","Jack","King","Queen"};
		String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
		deck = new Card[52];
		currentCard = 0;  // first card dealt
		
		// populate deck with card objects.
		for (int count=0;count < deck.length;count++) {
			deck[count] = new Card(faces[count % 13],suits[count/13]);
		}
		
	}

	// Shuffle the cards.
	public void Shuffle() {
		// call to method deal card should start at 0
		currentCard = 0;
		// Now, for each card , pick another random card (00-51) and swap them
		for (int first = 0;first < deck.length;first++) {
			//Select a random card between 0 - 51
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// Swap this (first) current card with a randomly selected second card.
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;			
		}
	}
	
	// deal a card
	public Card dealCard() {
		// determine whether cards remain to be dealt
		if (currentCard < deck.length) {
			return deck[currentCard++];
		}
		else {
			return null;
		}
	}
}