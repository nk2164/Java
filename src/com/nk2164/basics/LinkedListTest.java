package com.nk2164.basics;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<Integer> la	= new LinkedList<Integer>();
		
		Integer[] intArray = {1,2,3,4,5};
		
		la.addNode(intArray[0]);
		la.addNode(intArray[1]);
		la.addNode(intArray[2]);
		la.addNode(intArray[3]);
		la.addNode(intArray[4]);
		
		System.out.println("Before int pop");
		
		la.printData();		
		
		System.out.println("After int pop");
		la.popNode();
		
		la.printData();
		
		LinkedList<String> ll	= new LinkedList<String>();
		
		String[] strArray = {"A","B","C","D","E"};
		
		ll.addNode(strArray[0]);
		ll.addNode(strArray[1]);
		ll.addNode(strArray[2]);
		ll.addNode(strArray[3]);
		ll.addNode(strArray[4]);
		
		System.out.println("Before String pop");
		
		ll.printData();		
		
		System.out.println("After String pop");
		ll.popNode();
		
		ll.printData();
		
	}

}
