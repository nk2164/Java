package com.nk2164.algorithms;

public class DoubleEndedLinkedList {

	Neighbor firstLink;
	Neighbor lastLink;

	public void insetInFirstPosition(String homeOwnerName, int houseNumber) {

		// First create the new neighbor.
		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

		// If list is empty, then last link is this new neighbor object 
		// else, there are objects in the list , so we need to worry only 
		// about moving this new to the first position, so we point the 
		// previous of the prior firstlink to the new neighbor..which mean
		// the previous first negihbor is now no longer the first guy and
		// has a previous pointer filled.
		
		if (isEmpty()) {
			lastLink = theNewLink;
		} else {
			firstLink.previous = theNewLink;
		}		
		// now point the new neighbors next pointer of the prior firstlink.
		// and then, replace the firstlink with the new link.
		theNewLink.next = firstLink;
		firstLink = theNewLink;

	}

	public void insertInLastPosition(String homeOwnerName, int houseNumber) {

		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

		if (isEmpty()) {
			firstLink = theNewLink;
		} else {
			lastLink.next = theNewLink;
			theNewLink.previous = lastLink;
		}

		lastLink = theNewLink;

	}

	
	public boolean insertAfterKey(String HomeOwner, int houseNumber,int key) {
		 Neighbor theNewLink = new Neighbor(HomeOwner,houseNumber);
		 
		 // Start looping through the neighborhood.
		 
		 Neighbor currentNeighbor = firstLink;
		 
		 while(currentNeighbor.houseNumber != key) {
			 currentNeighbor = currentNeighbor.next;
			 
			 if (currentNeighbor == null) {
				 return false;
			 }
		 }
		 
		 // if we came out of the while loop, we know we have a match for the house key
		 
		 if (currentNeighbor == lastLink) {
			 theNewLink.next = null;
			 lastLink = theNewLink;
		 }else {
			 theNewLink.next = currentNeighbor.next;
			 currentNeighbor.next.previous = theNewLink;
		 }
			 
		 theNewLink.previous = currentNeighbor;
		 currentNeighbor.next = theNewLink;
		 
		 return true;
	}
	
	public void insertInOrder(String homeOwnerName, int houseNumber) {
		
		Neighbor theNewLink = new Neighbor(homeOwnerName,houseNumber);
		
		Neighbor previousNeighbor = null;
		Neighbor currentNeighbor = firstLink;
		
		while((currentNeighbor != null) && (houseNumber > currentNeighbor.houseNumber)) {
			previousNeighbor = currentNeighbor;
			currentNeighbor  = currentNeighbor.next;
		}
		
		if (previousNeighbor == null) {
			firstLink = theNewLink;
		} else {
			previousNeighbor.next = theNewLink;
		}
		theNewLink.next = currentNeighbor;
	}
	
	public boolean isEmpty() {
		return (firstLink == null);
	}
	
	public static void main(String[] args) {
		DoubleEndedLinkedList theLinkedList = new DoubleEndedLinkedList();
		
		theLinkedList.insertInOrder("Mark Evans 1", 7);
		theLinkedList.insertInOrder("Mark Evans 2", 9);
		theLinkedList.insertInOrder("Mark Evans 3", 6);
		theLinkedList.insertInOrder("Mark Evans 4", 4);
		
		theLinkedList.insertAfterKey("Derek Banas", 10, 7);
		
		theLinkedList.display();
		
		System.out.println("\n");
		
		NeighborIterator neighbors = new NeighborIterator(theLinkedList);
		
		neighbors.currentNeighbor.display();
		System.out.println(neighbors.hasNext());
		neighbors.next();
		neighbors.currentNeighbor.display();
		neighbors.remove();
		neighbors.currentNeighbor.display();
	}
	
	public void display() {
		Neighbor theLink = firstLink;
		
		while (theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			theLink = theLink.next;
			System.out.println();
		}
	}

}
