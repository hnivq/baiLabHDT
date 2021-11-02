/*
* create date Oct 21, 2021
* create time: 8:51:50 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Feline extends Animal{
	
	public Feline(String picture, String food, int hunger)
	{
		super(picture, food, hunger);
	}
	
	@Override
	protected void roam() {
		System.out.println("Tách đàn một mình đi một mình");
	}
}
