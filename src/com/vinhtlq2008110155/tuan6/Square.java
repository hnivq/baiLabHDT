/*
* create date Oct 16, 2021
* create time: 2:59:35 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan6;

public class Square {
	String amThanh = "Square sound"	;
	boolean check = false;

	void rotare(){
		System.out.println("Da xoay 360, backlip cac thu"); 
		check = true;	
	}

	void playSound(){
		if(check == true)
		{
			System.out.println("Am thanh dang duoc phat: " + amThanh);
			System.out.println("	***Ket thuc***");
		}
		else
			System.out.println("Co loi!!!");
	}
}
