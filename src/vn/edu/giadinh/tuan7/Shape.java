/*
* create date Oct 21, 2021
* create time: 11:05:19 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan7;

public class Shape {
	String sound;
	boolean state = false;

	void rotate(){
		System.out.println("Da xoay 360, backlip cac thu"); 
		state = true;	
	}

	void playSound(){
		if(state == true)
		{
			System.out.println("Am thanh dang duoc phat: " + sound);
			System.out.println("	***Ket thuc***");
		}
		else
			System.out.println("Co loi!!!");
	}
}
