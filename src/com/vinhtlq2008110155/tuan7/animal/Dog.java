/*
* create date Oct 21, 2021
* create time: 9:08:43 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Dog extends Canine{
	protected String picture = "Picture of Dog";
	protected String food = "Thức ăn cho chó cao cấp";
	protected int hunger = 5;

	@Override
	protected void makeNoise() {
		System.out.println("Chó con cute đang kêu !!!");
	}

	@Override
	protected void eat() {
		System.out.println("Chó con cute đang ăn ngon lành");
	}

	void chaseCat(){
		System.out.println("Hoàng thượng đang bị cún con đuổi");
	}
}
