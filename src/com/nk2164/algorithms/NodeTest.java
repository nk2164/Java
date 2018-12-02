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
		
		Node n4 = new Node();
		n4.setData(20);
		n3.setNext(n4);
		
		printChain(n1);
		System.out.println("This linked list has " + getNodeDepth(n1) + " nodes!");
	}
	
	static void printChain(Node n){
		while(n != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
	}
	
	// Get the depth of the node.
	static int getNodeDepth(Node n) {
		int count = 0;
		while(n != null) {
		  count += 1;
		  n = n.getNext();	
		}
		return count;
	}
}
