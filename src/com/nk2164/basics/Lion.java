package com.nk2164.basics;

public class Lion extends Animal {
	
	private static final String FAVORITE_FOOD = "meat";
	
	@Override
	public String getName(){
		return "Larry the lion";
	}
	
	@Override
	public String eats() {
		return FAVORITE_FOOD;
	}
	
	@Override
	public void eat(String food) {
		if (food == FAVORITE_FOOD) {
			System.out.println("Roar, yum , I love " + FAVORITE_FOOD);
		}
		else
			System.out.println("Why you feeding me this ? I'll eat the zookeeper!");
	}
	

}
