package com.nk2164.basics;

public class Owl implements Nocturnal {

	@Override
	public boolean isBlind() {
		return false;
	}

	public static void main(String[] args) {
		
		Nocturnal nocturnal = (Nocturnal) new Owl();
		System.out.println(nocturnal.isBlind());

	}

}
