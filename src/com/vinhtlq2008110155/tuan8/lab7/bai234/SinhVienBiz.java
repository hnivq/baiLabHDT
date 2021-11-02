/*
* create date Oct 28, 2021
* create time: 4:19:16 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab7.bai234;

public class SinhVienBiz extends SinhVienGD{
	double diemMarketing, diemSales;

	
	
	/**
	 * @param hoTen
	 * @param nganh
	 */
	public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
		super(hoTen, "Kinh tế");
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}



	@Override
	public double getDiem() {
		return (2*diemMarketing + diemSales)/3;
	}
}
