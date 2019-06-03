package com.nk2164.basics;

public class SimpleDotComTest {

	public static void main(String[] args) {
		
		SimpleDotCom dot = new SimpleDotCom();
		
		int[] locations = {2,3,4};
		
		dot.setLocationCells(locations);
		
		String guess  = "2";
		
		String result = dot.checkYourself(guess);
		
		if (result == "hit") {
			System.out.println("Test Worked!!");
		}
		

	}

}
