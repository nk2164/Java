package com.nk2164.basics;

import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		TreeMap<String,Integer> points = new TreeMap<String,Integer>();
		
		points.put("one", 123);
		points.put("two", 223);
		points.put("three",323);
		
		System.out.println(points.get("one"));
	}
}
