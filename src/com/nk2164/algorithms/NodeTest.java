package com.nk2164.algorithms;

public class NodeTest {
	
	public static void main(String[] args) {
		Node n1 = new Node();
		n1.setValue(3); 
		
		Node n2 = new Node();
		n2.setValue(5);
		n1.next = n2;
		
		Node n3 = new Node();
		n3.setValue(7);
		n2.next = n3;				
		
		printChain(n1);
	}
	
	static void printChain(Node n){
		while(n != null) {
			System.out.println(n.value);
			n = n.getNext();
		}
	}

}
