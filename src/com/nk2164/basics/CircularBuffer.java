package com.nk2164.basics;

public class CircularBuffer {

	private Object[] buffer;
	private int readCursor = 0;
	private int writeCursor = 0; 
	
	// Construct a circular buffer object.
	public CircularBuffer(int Size) {
		buffer = new Object[Size];
	}
	
	public boolean offer(Object value) {
		if (buffer[writeCursor] != null) {
			return false;
		}
		else {
			buffer[writeCursor] = value;
			writeCursor = next(writeCursor);
			return true;
		}
	}
	
	public Object poll() {
		final Object value = buffer[readCursor];
		
		if (value  != null) {
			buffer[readCursor] = null;
			readCursor = next(readCursor);
		}
		
		return value;
	}
	
	private int next(int index) {
		return (index+1)%buffer.length; 
	}

}
