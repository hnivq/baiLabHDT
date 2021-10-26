/*
* create date Oct 21, 2021
* create time: 11:56:03 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan7;

import java.security.PrivateKey;

public class Animal {
	private String picture;
	private String food;
	private int hunger;
	private	String boundaries;
	private int location;
	
	protected void makeNoise(){
		System.out.println("A A A");
	}

	protected void eat(){
		System.out.println("An binh thuong");
	}

	protected void sleep(){
		System.out.println("Dang ngu !!!");
	}

	protected void roam(){
		System.out.println("Di dao :)) ");
	}
}
