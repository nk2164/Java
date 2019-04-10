package com.nk2164.basics;

import java.security.SecureRandom;
public class RandomIntegers {
    
	private static int counter = 0;
	
	public static void main(String[] args) {
		SecureRandom randomNumber = new SecureRandom();
		
		for (int x=0;x<20;x++) {
			//pick a random number 
			int face = 1 + randomNumber.nextInt(5);
			System.out.printf("%d ",face);
			counter++;
			if (counter == 5) {
			  counter = 0;
			  System.out.println();
			}
			
		}
	
	}

}
