package com.nk2164.basics;

import java.io.IOException;

public class MyResouce implements AutoCloseable{

	@Override
	public void close() throws IOException {
		System.out.println("Closing resource");
		throw new IOException();
	}
 
}
