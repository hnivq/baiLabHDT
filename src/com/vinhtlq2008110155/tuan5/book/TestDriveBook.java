/*
* create date Oct 11, 2021
* create time: 7:40:37 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan5.book;

public class TestDriveBook {
	public static void main(String[] args) {
		Book sachGiaoKhoa;
		sachGiaoKhoa = new Book(30000, 35000, 100, "Bo Giao Duc", "12/2021", "Sach");
		
		sachGiaoKhoa.show();
		sachGiaoKhoa.sell(2,"13/10/2021");
		sachGiaoKhoa.amountLeft();
		sachGiaoKhoa.sell(20,"14/10/2021");
		sachGiaoKhoa.amountLeft();
	}	
}
