/*
* create date Nov 10, 2021
* create time: 7:59:23 PM
* author: hnivq
*/
package com.vinhtlq2008110155.tuan9.animal;

public class TestDrive {
	public static void main(String[] args) {
		ListAnimal listAnimal = new ListAnimal();
		Dog dog = new Dog("Con Chó", 5.5, "Chó");
		Cat cat = new Cat("Con mèo", 4.5, "Mèo");
		Fish fish = new Fish("Con cá", 0.8, "Cá");
		listAnimal.add(dog);
		listAnimal.add(cat);
		listAnimal.add(fish);
		listAnimal.introduce();
		listAnimal.makeNoise();
		
	}	
}
