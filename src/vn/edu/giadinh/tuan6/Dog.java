/*
* create date Oct 14, 2021
* create time: 9:55:14 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan6;

public class Dog {
	//attribute
	String breed;
	String color;
	int age;
	String size;
	boolean sex;	
	// method
	void show(){
		System.out.println("Giong: " + breed);
		System.out.println("Mau long: " + color);
		System.out.println("Tuoi: " + age);
		System.out.println("Kich thuoc: " + size);
		if(sex == true)
			System.out.println("Gioi tinh: con cai");
		else
			System.out.println("Gioi tinh: con duc");
	}

	void bark(String text){
		switch(text)
		{
		case "hello":
			System.out.println("ruff ruff ruff");
			break;
		case "hunger":
			System.out.println("RuffRuffRuff RuffRuffRuff");
			break;
		
		default :
			System.out.println("Se cap nhat them !!!");
		}
	}

	void bark(){
		System.out.println("gâu gâu gâu");
	}
	// constructor

	Dog(String giong, String mauSac, int tuoi, String kichThuoc, boolean gioiTinh){
		breed = giong;
		color = mauSac;
		age = tuoi;
		size = kichThuoc;
		sex = gioiTinh;
	}
}
