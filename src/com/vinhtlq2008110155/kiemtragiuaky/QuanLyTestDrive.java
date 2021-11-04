/*
* create date Nov 04, 2021
* create time: 7:47:06 AM
* author: hnivq
*/
package com.vinhtlq2008110155.kiemtragiuaky;

public class QuanLyTestDrive {
	public static void main(String[] args) {
		DanhSachQuanLy list = new DanhSachQuanLy();
		HocVien hVien;
		KhachHang kHang;
		NhanVien nVien;
		list.them(hVien);
		list.them(kHang);
		list.them(nVien);
		
		list.inDanhSach();
	}	
}
