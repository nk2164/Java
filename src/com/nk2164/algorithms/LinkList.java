package com.nk2164.algorithms;

class LinkList {
	public Link firstLink;
	
	public LinkList() {
		firstLink = null;
	}
	
	public boolean isEmpty() {
		return(firstLink == null);
	}
	
	public void insertFirstLink(String bookname, int milliseconds) {
		Link newLink = new Link(bookname,milliseconds);
		newLink.next = firstLink;
		firstLink = newLink;
	}
	
	public Link removeFirst() {
		Link linkReference = firstLink;
		if (!isEmpty()) {
			firstLink = firstLink.next;
		} else {
			System.out.println("Empty LinkedList");
		}
		
		return linkReference;
	}
	
	public void display() {
		Link theLink = firstLink;
		
		while(theLink != null) {
			theLink.display();
			System.out.println("Next Link: " + theLink.next);
			System.out.println();
			theLink = theLink.next;
		}
	}
	
	public Link find(String bookName) {
		Link theLink = firstLink;
		
		if(!isEmpty()) {
			while(theLink.bookname != bookName) {
				if(theLink.next == null) {
					return null;
				}
				else {
					theLink = theLink.next.next;
				}
			}
		} else {
			System.out.println("Empty LinkedList");
		}
		return theLink;
	}
	
	public Link removeLink(String bookName) {
		Link currentLink = firstLink;
		Link prevLink = firstLink;
		
		while(currentLink.bookname != bookName) {
			if(currentLink.next == null) {
				return null;
			} else {
				prevLink = currentLink;
				currentLink = currentLink.next;				
			}
			
			if(currentLink == firstLink) {
			 firstLink = firstLink.next;	
			} else {
				
				prevLink.next = currentLink.next;
			}
		}
		return currentLink;
	}
	
	
}