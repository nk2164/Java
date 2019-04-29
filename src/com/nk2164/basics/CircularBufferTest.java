package com.nk2164.basics;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CircularBufferTest {

	private CircularBuffer buffer = new CircularBuffer(2);

	@Test
	public void shouldOfferPollableElement() {
		assertTrue(buffer.offer(1));
		assertEquals(1, buffer.poll());
		assertNull(buffer.poll());
	}

	@Test
	public void shouldNotOfferWhenBufferFull() {
		assertTrue(buffer.offer(1));
		assertTrue(buffer.offer(2));
		assertFalse(buffer.offer(3));
	}

}
