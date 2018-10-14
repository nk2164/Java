package com.nk2164.basics;

public class BasicsDemo {

	private static void print() {
		System.out.println("\n\nInside Print");
		System.out.println("Hello, world !!");
		System.out.println(); // Print a space
		System.out.print("Hello World !!"); // Print this stuff
	}
	
	public static void main(String[] args) {
		print();
		int i = 6;
		int j = 2;
		int count = 25;
		boolean flag = true;
		System.out.println(i+j);
		System.out.println(i % j);
	}

}
