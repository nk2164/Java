package com.nk2164.basics;

import java.io.IOException;

public class SocketTest {

	public static void brokenTwo() {
		System.out.println("Starting");
		
		try(MyResouce r = new MyResouce();){
			System.out.println("in try");
		} 
		catch (IOException ioe) {
			System.out.println("Close failure ?");
		}
		finally {
			System.out.println("Explicit finally");
		}
	}
	
	public static void main(String[] args) {
		brokenTwo();
	}

}
