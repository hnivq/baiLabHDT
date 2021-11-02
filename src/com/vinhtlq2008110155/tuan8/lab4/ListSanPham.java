/*
* create date Oct 28, 2021
* create time: 2:14:48 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab4;

import java.util.ArrayList;
import java.util.List;

public class ListSanPham {
	public static void main(String[] args) {
		List<SanPhamUpgrade> list = new ArrayList<>();

		SanPhamUpgrade sp1 = new SanPhamUpgrade("Sách giáo khoa", 25000);
		SanPhamUpgrade sp2 = new SanPhamUpgrade("Kem đánh răng", 15000,12500);
		SanPhamUpgrade sp3 = new SanPhamUpgrade("Bàn chải", 10000,9500);

		list.add(sp1);
		list.add(sp2);
		list.add(sp3);

		for (SanPhamUpgrade sanPhamUpgrade : list) {
			sanPhamUpgrade.xuat();
		}
	}	
}
