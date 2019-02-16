package com.nk2164.basics;

import java.util.Scanner;

public class HelloWorld {

	static Scanner sc = new Scanner(System.in);
			
	public static void main(String[] args) {
		int minNum = 5;
		int maxNum = 20;
		
		//Gen a random number b/w minNum and maxNum 
		int randNum = minNum + (int) (Math.random() * ((maxNum-minNum) + 1));
		
		System.out.println(randNum);
		
	}

}
