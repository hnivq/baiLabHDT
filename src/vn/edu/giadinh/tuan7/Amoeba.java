/*
* create date Oct 21, 2021
* create time: 8:32:31 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan7;

public class Amoeba extends Shape {

	int x;
	int y;
	
	Amoeba(String s, int xx, int yy){
		x = xx;
		y = yy;
	}


	void rotate(){
		System.out.println("Xoay 360 theo toa do x = " + x + "va y = " + y);
	}
	


}
