package com.nk2164.basics;

public class Dog extends Animal {

	@Override
	public String getName() {
		return "Joki the Dog!";
	}

	@Override
	public String eats() {
		return "Kibbles";
	}

	@Override
	public void eat(String food) {
     System.out.println("Wuf ! , i like anything anyway, so i love " + food);
	}
}
