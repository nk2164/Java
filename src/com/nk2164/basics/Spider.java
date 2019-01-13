package com.nk2164.basics;

public class Spider extends Arthropod {

	public void printName(int input) {
		System.out.print("Spider");
	}
	
	public static void main(String[] args) {
		Spider spider = new Spider();
		spider.printName(4);
		spider.printName(9.0);
	}

}
