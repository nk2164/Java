package com.nk2164.ocja.chapter5;

public class Shark extends Fish {
	private int numberOfFins = 8;
	protected int size;
	public Shark(int age) {
		super(age);
		super.size = 4;
	}
	public void displaySharkDetails() {
		System.out.println("Shark with age: "+getAge());
		System.out.println(" and "+super.size+" meters long");
		System.out.println(" with "+numberOfFins+" fins");
	}
	
	public static void main(String[] args) {
		new Shark(10).displaySharkDetails();
	}
}
