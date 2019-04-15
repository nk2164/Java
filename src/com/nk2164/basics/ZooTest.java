package com.nk2164.basics;

public class ZooTest {

	public static void main(String[] args) {
		Animal[] zoo = {new Lion(),	new Dog()};
		
		Zookeeper zk = new Zookeeper();
		zk.feedAnimals(zoo);
		
	}

}
