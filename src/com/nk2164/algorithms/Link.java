package com.nk2164.algorithms;

public class Link {

	public String bookname;
	public int millionsSold;
	
	public Link next;
	
	public Link(String bookname, int millionsSold) {
		this.bookname = bookname;
		this.millionsSold = millionsSold;
	}
	
	public void display() {
 		System.out.println(bookname + ": " + millionsSold + ",000,000");
	}
	
	public String toString() {
		return bookname;
	}
}

