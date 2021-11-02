/*
* create date Oct 28, 2021
* create time: 4:27:53 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab7.bai234;

public class SinhVienIT extends SinhVienGD{
	private double diemJava;
	private double diemCss;
	private double diemHtml;
	/**
	 * @param hoTen
	 * @param nganh
	 * @param diemJava
	 * @param diemCss
	 * @param diemHtml
	 */
	public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
		super(hoTen, "IT");
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}

	@Override
	public double getDiem() {
		return (2*diemJava + diemHtml + diemCss)/4;
	}
}
