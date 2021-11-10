/*
* create date Nov 04, 2021
* create time: 11:32:20 AM
* author: hnivq
*/
package vn.edu.giadinh.tuan9;

import java.util.ArrayList;

public class AnimalManagment {
	private ArrayList<Animal> list;
	
	public AnimalManagment(){
		list = new ArrayList<>();
	}

	public void them(Animal animal)
	{
		list.add(animal);
	}

	public Animal timkiemDogTheoTen(String name){
		Dog d = null;

		for (Animal animal : list) {
			Dog dog1 = (Dog)animal;
	
				
		}
		return d;
	}


}
