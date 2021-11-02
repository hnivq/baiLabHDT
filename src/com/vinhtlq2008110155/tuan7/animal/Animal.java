/*
* create date Oct 21, 2021
* create time: 8:40:54 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

public class Animal {
	private String picture;
	private String food;
	private int hunger;
	private String boundaries;
	private int location;

	public Animal(String picture, String food, int hunger)
	{
		this.picture = picture;
		this.food = food;
		this.hunger = hunger;
	}

	/**
	 * @return the picture
	 */
	public String getPicture() {
		return picture;
	}

	/**
	 * @return the food
	 */
	public String getFood() {
		return food;
	}

	/**
	 * @return the hunger
	 */
	public int getHunger() {
		return hunger;
	}

	protected void makeNoise(){
		System.out.println("Động vật đang kêu");
	}

	protected void eat(){
		System.out.println("Ăn một cách bình thường");
	}
	
	protected void sleep(){
		System.out.println("Đang ngủ !!!");
	}

	protected void roam(){
		System.out.println("Đang đi loanh quanh");
	}
}
