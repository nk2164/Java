package com.nk2164.basics;

public class Zookeeper {
	
	public void feedAnimals(Animal[] animals) {
		
		for (Animal animal: animals) {
			String name = animal.getName();
			String favFood = animal.eats();
			System.out.printf("%s like %s%n", name, favFood);
			animal.eat(favFood);
			System.out.println("=========================");
		}
		
	}

}
