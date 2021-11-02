/*
* create date Oct 28, 2021
* create time: 2:27:15 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab7.bai1;

public class ChuNhat {
	private double rong;
	private double dai;

	/**
	 * @param dai the dai to set
	 */
	public void setDai(double dai) {
		this.dai = dai;
	}

	/**
	 * @param rong the rong to set
	 */
	public void setRong(double rong) {
		this.rong = rong;
	}

	/**
	 * @return the dai
	 */
	public double getDai() {
		return dai;
	}

	/**
	 * @return the rong
	 */
	public double getRong() {
		return rong;
	}

	/**
	 * @param rong
	 * @param dai
	 */
	public ChuNhat(double rong, double dai) {
		this.rong = rong;
		this.dai = dai;
	}

	protected double getChuVi() {
		return (dai + rong) * 2;
	}

	protected double getDienTich(){
		return dai * rong;
	}

	public void xuat(){
		System.out.println("Chieu dai: " +dai);
		System.out.println("Chieu rong: " +rong);
		System.out.println("Chu vi hcn = " + getChuVi());
		System.out.println("Dien tich hcn = " + getDienTich());
	}
}
