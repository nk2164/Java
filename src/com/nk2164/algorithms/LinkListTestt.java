package com.nk2164.algorithms;

public class LinkListTestt {
	
	public static void main(String[] args) {
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertFirstLink("Don Quixote",500);
		theLinkedList.insertFirstLink("A Tale of Two Cities",200);
		theLinkedList.insertFirstLink("The Lord of the Rings",150);
		theLinkedList.insertFirstLink("Harry Potter and the Sorcerers Stone",500);
		
		//theLinkedList.display();
		
		//theLinkedList.removeFirst();
		
		//System.out.println(theLinkedList.find("The Lord of the Rings") + " was found");
		
		theLinkedList.removeLink("The Lord of the Rings");
		
		theLinkedList.display();
	}


}
