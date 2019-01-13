package com.nk2164.basics;

public abstract interface Herbivore {
	
	int COUNT = 2;

	public abstract void eatPlants();
	
	int amount = 10;
	
	public static final int HERBIVORE = 2;
	
	public static void eatGrass() {
	};
	
	public default int chew() {
		return 13;
	}
}
