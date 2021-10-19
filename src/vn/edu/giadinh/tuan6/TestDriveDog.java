/*
* create date Oct 14, 2021
* create time: 10:09:19 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan6;

public class TestDriveDog {
	public static void main(String[] args) {
		Dog chiHuaHua = new Dog("Chihuahua","Nau",2,"nho",true);
		chiHuaHua.show();
		chiHuaHua.bark("hello");
		chiHuaHua.bark("hunger");
		chiHuaHua.bark();
	}	
}
