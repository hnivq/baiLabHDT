/*
* create date Oct 21, 2021
* create time: 8:55:27 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Cat extends Feline{
	protected String picture = "Picture of cat";
	protected String food = "Thức ăn cho mèo cao cấp";
	protected int hunger = 5;

	public Cat(String picture, String food, int hunger)
	{
		super(picture,food,hunger);
	}

	@Override
	protected void makeNoise() {
		System.out.println("Mồn lèo đang kêu !!!");
	}

	@Override
	protected void eat() {
		System.out.println("Mồn lèo ăn xong chê đồ ăn");
	}

	void chaseMouse(){
		System.out.println("Hoàng thượng đang bắt chuột");
	}
}
