/*
* create date Oct 28, 2021
* create time: 2:14:48 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSanPham {
	public static void main(String[] args) {
		List<SanPhamUpgrade> list = new ArrayList<>();

		System.out.print("Nhap so luong san pham: ");
		int n;
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int i = 0; i < n; i++)
		{
			SanPhamUpgrade sp = new SanPhamUpgrade();
			sp.nhap();
			list.add(sp);
		}

		for (SanPhamUpgrade sanPhamUpgrade : list) {
			sanPhamUpgrade.xuat();
		}
	}	
}
