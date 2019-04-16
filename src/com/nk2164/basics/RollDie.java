package com.nk2164.basics;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();
		int[] frequency = new int[7]; // array of frequency counters
		
		for (int count = 1; count <= 6000000; count++) {
			++frequency[1+randomNumbers.nextInt(6)];
		}
		
		System.out.printf("%s%10s%n", "Face" , "Frequency");
		
		for(int count=1;count<frequency.length;count++) {
			System.out.printf("%2d%11d%n", count , frequency[count]);
		}
	}

}
