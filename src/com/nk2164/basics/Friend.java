package com.nk2164.basics;

public class Friend extends Person{
	private String favor;
	
	public Friend(String name,String hairColor,String favor) {
		super(name,hairColor);
		this.favor = favor;
	}
	
	public void doFavor() {
		System.out.println("Hey friend, let me " + favor + "!");
	}
	
	@Override
	public void greet() {
		System.out.println("Hey my friend, it's " + getName());
	}
}
