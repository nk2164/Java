package com.nk2164.basics;

public class ThreadLoaderTest {

	public static void main(String[] args) {
		ThreadLoader tl = new ThreadLoader();

		try {
			Thread obj = new Thread(tl);
			obj.start();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
