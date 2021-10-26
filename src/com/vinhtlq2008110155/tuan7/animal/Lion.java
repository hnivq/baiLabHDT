/*
* create date Oct 21, 2021
* create time: 8:55:21 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Lion extends Feline{
	protected String picture = "Picture of Lion";
	protected String food = "Thịt";
	protected int hunger = 1;

	@Override
	protected void makeNoise() {
		System.out.println("Sư từ gầm !!!");
	}

	@Override
	protected void eat() {
		System.out.println("Sư từ xâu xé con mồi để ăn");
	}

	void hunter(){
		System.out.println("Sư tử canh me canh chua con Hà mã");
	}
}
