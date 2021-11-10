/*
* create date Oct 21, 2021
* create time: 8:53:30 PM
* author: hinvq
*/
package vn.edu.giadinh.tuan9;

public class Canine extends Animal{
	
	public Canine(String picture, String food, int hunger){
		super(picture, food, hunger);
	}

	@Override
	protected void roam() {
		System.out.println("Thích đi bầy đàn");
	}	
}
