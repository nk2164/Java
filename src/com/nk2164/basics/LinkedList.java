package com.nk2164.basics;

public class LinkedList<T extends Comparable<T>> implements Cloneable {

	private Node<T> head = null;

	public LinkedList() {

	}

	// Add a new node to the linked list.
	public <T> void addNode(Comparable data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
		} else {
			Node tempNode = head;

			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			;

			tempNode.setNext(newNode);
		}
	}

	// Traverse through the list and print the data 
	
	public void printData() {
		Node currNode = head;

		if (head == null) {
			System.out.println("Nothing to print");
		} else {

			do {
				System.out.println(currNode.toString());
				currNode = currNode.getNext();
				
			} while (currNode != null);
		}

	}
	
	// Pop the first item of the list and return it back to the caller.
	
	public Node<T> popNode(){
		if (head == null) {
			return null;
		}
		else {
			Node tempNode = head;
			head = tempNode.getNext();
			return tempNode;
		}
	}
	
	

}
