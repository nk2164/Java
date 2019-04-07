package com.nk2164.basics;

public class Interest {
	

	public static void main(String[] args) {
		// display header
		
		double principal = 1000;
		double rateOfInterest = 0.05;
		double amount; ///amount on deposit at end of each year.
		
		System.out.printf("%s%20s%n","Year","Amount on deposit");
		
		for (int year = 1;year <= 10;year ++) {
			// calculate new amount for specified year
			amount = principal * Math.pow(1.0 +rateOfInterest, year);
			
			System.out.printf("%4d%,20.2f%n",year,amount);
		}
		
	}

}
