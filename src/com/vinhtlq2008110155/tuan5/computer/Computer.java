/*
* create date Oct 13, 2021
* create time: 9:32:10 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan5.computer;

public class Computer {
	String producer;
	String releaseYear;
	String os;
	int ram;
	String cpu;
	String price;
	String baoHanh;

	Computer(String nhaSX, String namSX, String heDH, int r, String c, String gia, String bH){
		producer = nhaSX;
		releaseYear = namSX;
		os = heDH;
		ram = r;
		cpu = c;
		price = gia;
		baoHanh = bH;
	}

	void show(){
		System.out.println("Nha san xuat: " + producer);
		System.out.println("Nam ra mat: " + releaseYear);
		System.out.println("He dieu hanh: " + os);
		System.out.println("Ram: " + ram);
		System.out.println("Cpu: " + cpu);
		System.out.println("Gia: " + price);
		System.out.println("Bao hanh: " + baoHanh);
	}
}
