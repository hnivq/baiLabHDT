/*
* create date Nov 10, 2021
* create time: 7:21:35 PM
* author: hnivq
*/
package com.vinhtlq2008110155.tuan9.animal;

public class Dog extends Animal{

	/**
	 * @param name
	 * @param d
	 * @param breed
	 */
	public Dog(String name, double d, String breed) {
		super(name, d, breed);
	}
	
	@Override
	protected void makeNoise() {
		System.out.println("Gâu gâu gâu!!!");
	}

	@Override
	protected void play() {
		System.out.println("Chó đang chơi cục xương ");
	}

	@Override
	protected void eat() {
		System.out.println("Chó đang gặm xương");
	}
}
