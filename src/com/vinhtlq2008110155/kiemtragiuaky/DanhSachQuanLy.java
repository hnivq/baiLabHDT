/*
* create date Nov 04, 2021
* create time: 8:10:44 AM
* author: hnivq
*/
package com.vinhtlq2008110155.kiemtragiuaky;

import java.util.ArrayList;

public class DanhSachQuanLy{
	private ArrayList<Object> danhSach = new ArrayList<>();
	
	public void them(Object object)
	{
		danhSach.add(object);
	}

	public void inDanhSach() {
		for (Object object : danhSach) {
			System.out.println(object.toString());
		}
	}
}
