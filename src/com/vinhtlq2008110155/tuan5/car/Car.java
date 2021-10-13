/*
* create date Oct 13, 2021
* create time: 7:25:13 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan5.car;

public class Car {
	String owner;
	String hangSX;
	String type;
	String giayPhep;
	int lit;

	Car(String chuxe, String hsx, String dong, String gp, int l){
		owner = chuxe;
		hangSX = hsx;
		type = dong;
		giayPhep = gp;
		lit = l;
	}

	void show(){
		System.out.println("Chu xe: " + owner);
		System.out.println("Dong xe: " + type);
		System.out.println("Hang san xuat: " + hangSX);
		System.out.println("Giay phep: " + giayPhep);
		System.out.println("Dung tich binh xang: " + lit);
	}
	// chuyên mục xe em không rành nên kh biết phải quả lý cái gì
	// nên em chỉ để một phương thức show thôi nha thầy ♥
}
