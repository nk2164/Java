package com.nk2164.basics;

public class PassByValue {

	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder("Hello");
		
		addWord(sb);
		
		System.out.println(sb.toString());
		
		addWordAlt(sb);
		
		System.out.println("After: " + sb.toString());
	}
	
	private static void addWord(StringBuilder sb) {
		
		sb.append(" World !");
		
	}
	
	private static void addWordAlt(StringBuilder sb) {
		sb = new StringBuilder();
		sb.append("Hola");
		System.out.println("Inside addWorldAlt : " + sb.toString());
	}
	
	

}
