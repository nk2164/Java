package com.nk2164.basics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TypeUnsafeExampleTest {
	
	@Test
	public void concatenateTest() {

		CircularBuffer buffer = new CircularBuffer(4);
		
		buffer.offer("a");
		buffer.offer("b");
		buffer.offer("c");
		buffer.offer("d");
		
		assertEquals("abcd", TypeUnsafeExample.Concatenate(buffer));
	}
	

}
