/*
* create date Oct 14, 2021
* create time: 11:11:18 AM
* author: hinvq
*/
package vn.edu.giadinh.tuan6;

public class TestDriveMayTinh {
	public static void main(String[] args) {
		MayTinh mt = new MayTinh();
		int t1 = mt.tong(5,7);
		int t2 = mt.tong(5,6,7);
		System.out.println("t1 = " + t1);
		System.out.println("t2 = " + t2);
	}	
}
