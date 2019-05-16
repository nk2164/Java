package com.nk2164.basics;

public class TupleTest {

	public static void main(String[] args) {
		
		Tuple<String, Integer>  tu	= new Tuple<>("Hi", 2);
		System.out.println(tu.toString());
		
		Tuple<Tuple<String,Integer>, Integer>  tv	= new Tuple<>(tu, 20);
		System.out.println(tv.toString());

	}

}
