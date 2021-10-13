/*
* create date Oct 13, 2021
* create time: 7:46:11 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan5.employee;

public class Employee {
	String name;
	int salary;
	String address;
	String boPhanLamViec;
	String birth;

	Employee(String ten, String bPLV, int luong, String ngaySinh, String diaChi){
		name = ten;
		boPhanLamViec = bPLV;
		salary = luong;
		birth = ngaySinh;
		address = diaChi;
	}

	void show(){
		System.out.println("Ten nhan vien: " + name);
		System.out.println("Bo phan lam viec: " + boPhanLamViec);
		System.out.println("Muc luong: " + salary);
		System.out.println("Ngay thang nam sinh: " + birth);
		System.out.println("Dia chi: " + address);
	}
}
