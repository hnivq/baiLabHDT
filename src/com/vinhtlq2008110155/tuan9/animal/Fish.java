/*
* create date Nov 10, 2021
* create time: 7:25:15 PM
* author: hnivq
*/
package com.vinhtlq2008110155.tuan9.animal;

public class Fish extends Animal{

	/**
	 * @param name
	 * @param d
	 * @param breed
	 */
	public Fish(String name, double d, String breed) {
		super(name, d, breed);
	}
	
	@Override
	protected void makeNoise() {
		System.out.println("OoO OoO OoO!!!");
	}

	@Override
	protected void play() {
		System.out.println("Cá đang chơi với bong bóng nước");
	}

	@Override
	protected void eat() {
		System.out.println("Cá đang ăn thức ăn cho cá");
	}
}
