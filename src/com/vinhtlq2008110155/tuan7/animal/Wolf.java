/*
* create date Oct 21, 2021
* create time: 9:12:26 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Wolf extends Canine{
	protected String picture = "Picture of Wolf";
	protected String food = "Thịt";
	protected int hunger = 1;

	@Override
	protected void makeNoise() {
		System.out.println("U u u u!!!");
	}

	@Override
	protected void eat() {
		System.out.println("ăn theo bầy đàn");
	}
}
