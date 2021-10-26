/*
* create date Oct 21, 2021
* create time: 8:40:54 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Animal {
	protected String picture;
	protected String food;
	protected int hunger;
	protected String boundaries;
	protected int location;


	protected void makeNoise(){
		System.out.println("Động vật đang kêu");
	}

	protected void eat(){
		System.out.println("Ăn một cách bình thường");
	}
	
	protected void sleep(){
		System.out.println("Đang ngủ !!!");
	}

	protected void roam(){
		System.out.println("Đang đi loanh quanh");
	}
}
