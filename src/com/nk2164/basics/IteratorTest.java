package com.nk2164.basics;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorTest {

	public static void main(String[] args) {
		java.util.LinkedList<String> list = new LinkedList<String>();
		list.add("cat");
		list.add("dog");
		list.add("monkey");
		
		Iterator<String> it = list.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
	}
}
