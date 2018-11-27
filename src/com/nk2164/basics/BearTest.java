package com.nk2164.basics;

public class BearTest {

	public static void main(String[] args) {
		Herbivore b1 = new Bear();
		Omnivore  b2 = new Bear();
		System.out.println(Herbivore.COUNT);
		b1.eatPlants();
		b2.eatPlants(2);
		b2.eatMeat();
		b2.eatHoney();
		
	}

}
