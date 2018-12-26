package com.nk2164.basics;

public class Lemur {

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		Object obj = lemur;
		
		lemur.printline();
	}

	void printline(){
		System.out.println("Hi I am a Lemur");
	}
}
