package com.nk2164.simon.lesson1;

public class SwitchExample {

	public static void main(String[] args) {
		
		int month = 3;
		
		switch (month) {
			case 1: System.out.println("Jan");
					break;
			case 2: System.out.println("Feb");
					break;
			case 3: System.out.println("March");
					break;			
			default: System.out.println("April");
		
		}
		
		String text = "hello";
		
		switch (text) {
			case "Hi": System.out.println("Hi");
					break;
			case "Hola": System.out.println("Hola");
					break;
			case "hello": System.out.println("hello");
					break;			
			default: System.out.println("default");
		
		}		
		
	}

}
