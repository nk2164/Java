package com.nk2164.ocja.chapter5;

public class Lion extends Animal {
	public Lion(int age) {
	  super(age);
	}
	public void roar() {
		System.out.println("The " + getAge() + " years old lion says: Roar!");
	}
}
