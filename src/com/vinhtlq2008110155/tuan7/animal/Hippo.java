/*
* create date Oct 26, 2021
* create time: 1:15:19 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Hippo extends Animal {
	protected String picture = "Picture of Hippo";
	protected String food = "rau củ";
	protected int hunger = 3;

	@Override
	protected void makeNoise() {
		System.out.println("Hippo đang kêu!!!");
	}
}
