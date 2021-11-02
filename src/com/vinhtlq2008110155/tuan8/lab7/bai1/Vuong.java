/*
* create date Oct 28, 2021
* create time: 3:07:48 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab7.bai1;

public class Vuong extends ChuNhat{
	
	public Vuong(double canh){
		super(canh, canh);
	}

	public void xuat(){
		System.out.println("Cạnh: " + getDai());
		System.out.println("Chu vi hinh vuong = " + getChuVi());
		System.out.println("Dien tich hinh vuong = " + getDienTich());
	}
}
