package com.nk2164.basics;

public class Bear implements Omnivore, Herbivore {

	@Override
	public void eatPlants() {
		System.out.println("I am eating plants !");

	}

	@Override
	public void eatMeat() {
		System.out.println("I am eating meat !");

	}

	@Override
	public void eatHoney() {
		System.out.println("I am eating honey !");
		
	}

	@Override
	public void eatPlants(int j) {
		System.out.println("I am eating plants with int j !");
		
	}

}
