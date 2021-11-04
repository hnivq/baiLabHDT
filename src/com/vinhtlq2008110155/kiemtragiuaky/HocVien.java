/*
* create date Nov 04, 2021
* create time: 7:34:51 AM
* author: hnivq
*/
package com.vinhtlq2008110155.kiemtragiuaky;

import java.util.Scanner;

public class HocVien extends Nguoi{
	private float diemMonhoc1;
	private float diemMonhoc2;
	private static int soLuongHV;

	public HocVien()
	{
		super();
		setDiemMonhoc1();
		setDiemMonhoc2();
		soLuongHV ++;
	}

	protected float diemTB()
	{
		return (diemMonhoc1 + diemMonhoc2)/2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + diemTB();
	}

	/**
	 * @param diemMonhoc1 the diemMonhoc1 to set
	 */
	public void setDiemMonhoc1() {
		do
		{
			System.out.println("Diem khong am va nho hon 10");
			diemMonhoc1 = scanner.nextFloat();
		}while(diemMonhoc1 < 0 && diemMonhoc1 > 10);
	}

	/**
	 * @param diemMonhoc2 the diemMonhoc2 to set
	 */
	public void setDiemMonhoc2() {
		do
		{
			System.out.println("Diem khong am va nho hon 10");
			diemMonhoc2 = scanner.nextFloat();
		}while(diemMonhoc2 < 0 && diemMonhoc2 > 10);
	}


}
