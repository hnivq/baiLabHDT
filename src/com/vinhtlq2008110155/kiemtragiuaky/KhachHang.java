/*
* create date Nov 04, 2021
* create time: 7:39:36 AM
* author: hnivq
*/
package com.vinhtlq2008110155.kiemtragiuaky;

public class KhachHang extends Nguoi{
	private String tenCongTy;
	private double triGiaHoaDon;

	public KhachHang()
	{
		super();
		setTenCongTy();
		setTriGiaHoaDon();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " " + tenCongTy + " " + triGiaHoaDon;
	}

	/**
	 * @param triGiaHoaDon the triGiaHoaDon to set
	 */
	public void setTriGiaHoaDon() {
		do
		{
			System.out.println("Gia tri phai khong am");
			triGiaHoaDon = scanner.nextFloat();
		}while(triGiaHoaDon < 0);
	}
	
	/**
	 * @param tenCongTy the tenCongTy to set
	 */
	public void setTenCongTy() {
		System.out.print("Dien ten cong ty: ");
		tenCongTy = scanner.nextLine();
	}
}
