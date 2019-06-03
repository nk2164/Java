package com.nk2164.basics;

public class Shuffel {

	public static void main(String[] args) {

		int x = 3;

		while(x > 0 ) {
		
			if (x > 2) {
				System.out.print("a");
			}
			
			x = x-1;
			System.out.print("-");
			
			if (x == 2) {
				System.out.print("b c");
			}
			
			if (x == 1) {
				System.out.print("d");
				x = x-1;
			}
		}
		
	    int x1 = 1;
	    while ( x1 < 10 ) {
	      if ( x1 > 3) {
	        System.out.println("big x1");
	      }
	    }
	    
	    char test = 'g'; 
		
	}

}
