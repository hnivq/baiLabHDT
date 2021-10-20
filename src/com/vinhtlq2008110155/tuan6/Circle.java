/*
* create date Oct 18, 2021
* create time: 9:38:54 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan6;

public class Circle {
	String amThanh = "Circle sound"	;
	boolean state = false;

	void rotare(){
		System.out.println("Da xoay 360, backlip cac thu"); 
		state = true;	
	}

	void playSound(){
		if(state == true)
		{
			System.out.println("Am thanh dang duoc phat: " + amThanh);
			System.out.println("	***Ket thuc***");
		}
		else
			System.out.println("Co loi!!!");
	}	
}
