/*
* create date Oct 13, 2021
* create time: 8:14:30 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan5.cow;

public class Cow {
	int age;
	int weight;
	    
	Cow(int year,int amount){
		age = year;
		weight = amount;
	}
	    
	void showData(){
		System.out.println("Số tuổi: "+age);
		System.out.println("Cân nặng: "+weight+" Kg");
	}
	
	void moo(String text){
		switch(text)
		{
		case "hello":
			System.out.println("Moo Mooooo Mo");
			break;
		
		default :
			System.out.println("Se cap nhat them !!!");
		}
	}
}	