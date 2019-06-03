package com.nk2164.basics;

public class SimpleDotCom {
	
	int[] locationCells;
	int numOfHits = 0;
	
	String checkYourself(String guess) {
		int yourGuess = Integer.parseInt(guess);

		String result = "miss";
		
		for (int cell : locationCells) {
			if (yourGuess == cell) {
				result = "hit";
				numOfHits ++;
				break;
			} else {
				result = "miss";
			}
		}
		
		if (numOfHits == 3) {
			result = "kill";
		}
		
		System.out.println(result);
		return result;
	}
	
	void setLocationCells(int[] loc) {
		this.locationCells = loc;
	}

}
