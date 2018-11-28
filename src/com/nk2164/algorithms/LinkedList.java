package com.nk2164.algorithms;

public class LinkedList {
	
	private Node head;
	
	public void insert(int data) {
		Node node = new Node();
		node.setData(data);
		node.setNext(null); 
		
		// During insert , check first to see if head is null...
		// if yes , make head as the first node.
		
		if (head == null) {
			head = node;
		}
		else {
			Node n = head; // starting point
			while(n.getNext() != null) {
				n = n.getNext();
			}
			//once you get the last node, move this new node here.
			n.setNext(node);
		}
	}
	
	public void show() {
		Node n = head;
		
		while(n.getNext() != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
		System.out.println(n.getData());
		
		
	}

	
}
