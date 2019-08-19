package com.nk2164.basics;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String,Integer> points = new HashMap<String,Integer>();
		
		points.put("one", 123);
		points.put("two", 223);
		points.put("three",323);
		
		System.out.println(points.get("one"));
	}
}
