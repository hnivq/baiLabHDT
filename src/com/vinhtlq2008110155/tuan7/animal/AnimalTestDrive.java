/*
* create date Oct 26, 2021
* create time: 1:09:36 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan7.animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalTestDrive {
	public static void main(String[] args) {
		Cat meo = new Cat("picture of cat","Ăn thức ăn cho mèo cao cấp", 5);

		Dog cho = new Dog("picture of dog", "Ăn thức ăn cho chó cao cấp", 5);
		
		Lion suTu = new Lion("picture of lion", "Thịt", 1);
		
		Wolf soi = new Wolf("picture of wolf","Thịt", 2);
		
		Tiger ho = new Tiger("picture of tiger","Thịt", 2);
		
		Hippo haMa = new Hippo("picture of hippo", "Rau củ", 5);
		
		List<Animal> list = new ArrayList<>();

		list.add(meo);
		list.add(cho);
		list.add(suTu);
		list.add(soi);
		list.add(ho);
		list.add(haMa);

		for (Animal animal : list ) {
			animal.makeNoise();
			animal.eat();
			animal.roam();
			System.out.println("***************");
		}
	}	
}
