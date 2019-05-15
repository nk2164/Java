package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(10);
		li.add(16);
		
		li.forEach(System.out::println);
	}
}
