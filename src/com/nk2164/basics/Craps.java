package com.nk2164.basics;

import java.security.SecureRandom;

public class Craps {
	private static final SecureRandom randomNumber = new SecureRandom();
	//enum types that represent game status
	private enum Status {CONTINUE,WON,LOST};
	
	//constants that represent the summ of dice
	private static final int SANKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 6;
	
	public static void main(String[] args) {
		int myPoint = 0;
		
		
		
	}
	
	private static int rollDie() {
		int rollOne = 1 + randomNumber.nextInt(6);
		int rollTwo = 1 + randomNumber.nextInt(6);
		System.out.println("The player rolled " + rollOne + " and " + rollTwo + " total = " + (rollOne+rollTwo));
		return (rollOne+rollTwo);
	}
}
