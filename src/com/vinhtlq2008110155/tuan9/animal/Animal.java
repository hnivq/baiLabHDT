/*
* create date Nov 10, 2021
* create time: 7:08:02 PM
* author: hnivq
*/
package com.vinhtlq2008110155.tuan9.animal;

import com.vinhtlq2008110155.tuan9.List;

public class Animal {
	private String name;
	private double weight;
	private String breed;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 * @param weight
	 * @param breed
	 */
	public Animal(String name, double weight, String breed) {
		this.name = name;
		this.weight = weight;
		this.breed = breed;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(float weight) {
		this.weight = weight;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	protected void makeNoise()
	{
		System.out.println("Động vật đang kêu!!!");
	}

	protected void play()
	{
		System.out.println("Động vật đang chơi!!!");
	}

	protected void eat()
	{
		System.out.println("Động vật đang ăn!!!");
	}

	
	protected void introduce() {
		System.out.println("I'm "+ getName() + " is a " + getBreed() + " weight: " +getWeight());
	}

	protected void sleep()
	{
		System.out.println("zZz zZz zZz");
	}

}
