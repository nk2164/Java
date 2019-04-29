package com.nk2164.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("Line1");
		list.add("Hi");
		
		String myString = (String) list.get(2);
		System.out.println(myString);
	}

}
