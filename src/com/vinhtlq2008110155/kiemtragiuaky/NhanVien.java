/*
* create date Nov 04, 2021
* create time: 7:37:50 AM
* author: hnivq
*/
package com.vinhtlq2008110155.kiemtragiuaky;

public class NhanVien extends Nguoi{
	private float heSoLuong;

	public NhanVien() {
		super();
		setHeSoLuong();
	}

	protected float tinhLuong()
	{
		return heSoLuong*1500000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + tinhLuong();
	}

	/**
	 * @param heSoLuong the heSoLuong to set
	 */
	public void setHeSoLuong() {
		do
		{
			System.out.println("Gia tri phai khong am");
			heSoLuong = scanner.nextFloat();
		}while(heSoLuong < 0);
	}
}
