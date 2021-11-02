/*
* create date Oct 28, 2021
* create time: 2:10:24 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab4;

public class SanPhamUpgradeTest {
	public static void main(String[] args) {
		SanPhamUpgrade spGiamGia = new SanPhamUpgrade("Kem đánh răng", 15000,20000);
		SanPhamUpgrade spKhongGiamGia = new SanPhamUpgrade("Sách giáo khoa", 20000);

		spGiamGia.xuat();
		spKhongGiamGia.xuat();
	}	
}
