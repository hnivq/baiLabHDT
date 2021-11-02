/*
* create date Oct 21, 2021
* create time: 8:56:06 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Tiger extends Feline{	

	/**
	 * @param picture
	 * @param food
	 * @param hunger
	 */
	public Tiger(String picture, String food, int hunger) {
		super(picture, food, hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Tiger đang kêu !!!");
	}

	@Override
	protected void eat() {
		System.out.println("Tiger đang ăn ngấu nghiến");
	}
}
