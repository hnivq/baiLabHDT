/*
* create date Nov 04, 2021
* create time: 7:33:36 AM
* author: hnivq
*/
package com.vinhtlq2008110155.kiemtragiuaky;

import java.util.Scanner;

public class Nguoi {
	private String hoTen;
	private String diaChi;

	Scanner scanner = new Scanner(System.in);
	public Nguoi()
	{
		setHoTen();
		setDiaChi();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hoTen +" "+diaChi;
	}

	/**
	 * @param diaChi the diaChi to set
	 */
	public void setDiaChi() {
		System.out.print("Nhap dia chi: ");
		diaChi = scanner.nextLine();
		this.diaChi = diaChi;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen() {
		System.out.print("Nhap ho va ten: ");
		hoTen = scanner.nextLine();
	}

}
