package com.nk2164.basics;

public class Node<T extends Comparable<T>> {
	
	private T data;
	private Node<T> next;
	
	public Node(T data){
		this.data = data;
		setNext(null);
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public Node<T> getNext(){
		return this.next;
	}
	
	public T getData() {
		return data;
	}
	
	@Override
	public String toString() {
		return String.valueOf(data);
	}
	
}
