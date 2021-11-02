/*
* create date Oct 28, 2021
* create time: 3:42:37 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab7.bai234;

import java.util.Scanner;

public abstract class SinhVienGD {
	private String hoTen, nganh;

	public SinhVienGD(String hoTen, String nganh){
		this.hoTen = hoTen;
		this.nganh = nganh;
	}

	public abstract double getDiem();

	public String getHocLuc()
	{
		String hocLuc;
		double diem = getDiem();
		if(diem < 5)
			hocLuc = "Yếu";
		else if(diem >= 5 && diem < 6.5)
			hocLuc = "Trung bình";
		else if(diem >=6.5 && diem < 7.5)
			hocLuc = "Khá";
		else if(diem >=7.5 && diem < 9)
			hocLuc = "Giỏi";
		else
			hocLuc = "Xuất sắc";
		return hocLuc;
	}

	public void xuat(){
		System.out.println("Họ và Tên: "+hoTen);
		System.out.println("Ngành: "+ nganh);
		System.out.println("Học lực: "+ getHocLuc());
		System.out.println("***");
	}

}
