package com.nk2164.basics;

public class FriendTest {

	public static void main(String[] args) {
		Person p = new Person("Andrew", "Grey");
		System.out.println(p.getName() + " has " + p.hairColor + " hair.");
		p.greet();
		
		Friend f = new Friend("Toni", "Blonde", "help you fix that flat tire");
		System.out.println(f.getName() + " has " + f.hairColor + " hair.");
		f.greet();
		f.doFavor();
	}

}
