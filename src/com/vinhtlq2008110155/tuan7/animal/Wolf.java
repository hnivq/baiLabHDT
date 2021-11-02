/*
* create date Oct 21, 2021
* create time: 9:12:26 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Wolf extends Canine{

	/**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Wolf(String picture, String food, int hunger) {
		super(picture, food, hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("U u u u!!!");
	}

	@Override
	protected void eat() {
		System.out.println("ăn theo bầy đàn");
	}
}
