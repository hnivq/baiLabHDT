/*
* create date Oct 26, 2021
* create time: 1:15:19 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Hippo extends Animal {
	

	/**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Hippo(String picture, String food, int hunger) {
		super(picture, food, hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Hippo đang kêu!!!");
	}
}
