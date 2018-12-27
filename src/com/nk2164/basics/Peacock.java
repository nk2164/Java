package com.nk2164.basics;

public class Peacock extends Bird {
	@Override
	public String getName() {
		return "Peacock";
	}
	
	public static void main(String[] args) {
		Bird bird = new Peacock();
		bird.displayInformation();
	}
}
