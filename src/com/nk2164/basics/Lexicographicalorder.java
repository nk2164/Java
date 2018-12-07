package com.nk2164.basics;

import java.util.ArrayList;

// Given String S and Length K, complete the function so that it finds lexicographically smallest 
// and largest substring of length K

public class Lexicographicalorder {
	
	public static void main(String[] args) {

		String S = "welcometojava";
		
		int k = 2;
		int start = 0, end = 0;

		boolean done = false;
		
		start = 0;
		end = start + k;
		
		while (!done) {
			System.out.println(S.substring(start, end));
			start = start + 1;
			end = start + k;
			if (end > S.length()) {
				done = true;
			}
		}

	}
	
}
