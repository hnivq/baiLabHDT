/*
* create date Nov 10, 2021
* create time: 7:15:18 PM
* author: hnivq
*/
package com.vinhtlq2008110155.tuan9.animal;

public class Cat extends Animal{
	
	/**
	 * @param name
	 * @param d
	 * @param breed
	 */
	public Cat(String name, double d, String breed) {
		super(name, d, breed);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Meo meo meo!!!");
	}

	@Override
	protected void play() {
		System.out.println("Chơi với bóng len");
	}

	@Override
	protected void eat() {
		System.out.println("Hoàng thượng đang ăn");
	}	

}
