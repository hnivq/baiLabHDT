/*
* create date Nov 10, 2021
* create time: 7:15:07 PM
* author: hnivq
*/
package com.vinhtlq2008110155.tuan9.animal;

import java.util.ArrayList;

public class ListAnimal {
	ArrayList<Animal> list = new ArrayList<Animal>();
	
	public void add(Animal animal)
	{
		list.add(animal);
	}

	public void introduce()
	{
		for (Animal animal : list) {
			animal.introduce();
		}
	}

	public void feed()
	{
		for (Animal animal : list) {
			animal.eat();
		}
	}

	public void makeNoise()
	{
		for (Animal animal : list) {
			animal.makeNoise();
		}
	}

	public void sleep()
	{
		for (Animal animal : list) {
			animal.sleep();
		}
	}

	public Animal sreachName(String name)
	{
		Dog d = null;

		for (Animal animal : list) {
			if(animal instanceof Dog){
				Dog dog = (Dog)animal;
				if(dog.getName().equalsIgnoreCase(name))
					d = dog;
			}			
		}
		return d;
	}
}
