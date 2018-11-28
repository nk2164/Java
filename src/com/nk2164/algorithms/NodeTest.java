package com.nk2164.algorithms;

public class NodeTest {
	
	public static void main(String[] args) {
		Node n1 = new Node();
		n1.setData(3); 
		
		Node n2 = new Node();
		n2.setData(5);
		n1.setNext(n2);
		
		Node n3 = new Node();
		n3.setData(7);
		n2.setNext(n3);				
		
		printChain(n1);
	}
	
	static void printChain(Node n){
		while(n != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}

}
