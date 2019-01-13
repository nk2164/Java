package com.nk2164.ocja.chapter5;

public class ZooWorker {

	public static void feed(Reptile reptile) {
		System.out.println("I am feeding a " + reptile.getName());
	}
	public static void main(String[] args) {
		feed(new Reptile("Reptiles!"));
		feed(new Alligators());
		feed(new Crocodile());
	}

}
