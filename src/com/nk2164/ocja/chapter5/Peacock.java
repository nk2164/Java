package com.nk2164.ocja.chapter5;

import com.nk2164.basics.Bird;

public class Peacock extends Bird {

	@Override
	public String getName() {
		return "Peacock";
	}
	
	public static void main(String[] args) {
		Bird bird = new Peacock();
		bird.displayInformation();
		
		Peacock peacock = new Peacock();
		peacock.displayInformation();
	}

}
