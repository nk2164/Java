package com.nk2164.simon.lesson1;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Hello");
		al.add("Bienvenue");
		al.add("Wilkomen");
		
		for (String obj: al) {
			System.out.println("The object is " + obj);
		}
		
		int x = 0;
		
		do {
			System.out.println("x is " + x);
		} while (x > 0);
	}

}
