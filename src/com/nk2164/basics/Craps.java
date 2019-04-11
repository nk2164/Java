package com.nk2164.basics;

import java.security.SecureRandom;

public class Craps {
	private static final SecureRandom randomNumber = new SecureRandom();

	// enum types that represent game status
	private enum Status {
		CONTINUE, WON, LOST
	};

	// constants that represent the sum of dice
	
	private static final int SANKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {
		int myPoint = 0;
		Status gameStatus; // can contain continue , one or lost.
		int sumOfDice = rollDice(); // Thats the first roll of dice
		
		switch (sumOfDice) {
		case SEVEN:
		case YO_LEVEN:
			gameStatus = Status.WON;
			break;
		case SANKE_EYES:
		case TREY:
		case BOX_CARS:
			gameStatus = Status.LOST;
			break;
		default:
			gameStatus = Status.CONTINUE;
			myPoint = sumOfDice;
			break;
		}
		
		// while game status is continue, we need to keep rolling.
		
		while(gameStatus == Status.CONTINUE) {
			sumOfDice = rollDice();
			
			if (sumOfDice == myPoint) {
				gameStatus = Status.WON;
			}
			else if (sumOfDice == SEVEN) {
				gameStatus = Status.LOST;
			}
		}
		
		// Display won or lost message.
		
		if (gameStatus == Status.WON) {
			System.out.println("The player won !");
		}
		else {
			System.out.println("The player lost !");			
		}
		
	}

	private static int rollDice() {
		int rollOne = 1 + randomNumber.nextInt(6);
		int rollTwo = 1 + randomNumber.nextInt(6);
		System.out.println("The player rolled " + rollOne + " and " + rollTwo + " total = " + (rollOne + rollTwo));
		return (rollOne + rollTwo);
	}
}
