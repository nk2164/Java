package com.nk2164.simon.lesson1;

public class LoopMethodScope {
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++)
			System.out.println("i is " + i);
		
//		System.out.println(" final i is" + i);
		
		int j = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i is " + i);
			j += i;
		}

//		System.out.println("final i is" + i);
		System.out.println("final j is" + j);
	}
	
	public	void doStuff(int i) {
		System.out.println("i is " + i);
	}

}
