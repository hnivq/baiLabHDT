/*
* create date Oct 28, 2021
* create time: 2:01:01 PM
* author: hinvq
*/
package com.vinhtlq2008110155.tuan8.lab4;

public class SanPhamUpgrade {
	private String tenSp;
	private double donGia;
	private double giamGia;

	public SanPhamUpgrade(String tenSp, double donGia)
	{
		this.tenSp = tenSp;
		this.donGia = donGia;
	}

	/**
	 * @param tenSp
	 * @param donGia
	 * @param giamGia
	 */
	public SanPhamUpgrade(String tenSp, double donGia, double giamGia) {
		this.tenSp = tenSp;
		this.donGia = donGia;
		this.giamGia = giamGia;
	}

	/**
	 * @return the donGia
	 */
	public double getDonGia() {
		return donGia;
	}

	/**
	 * @param donGia the donGia to set
	 */
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	/**
	 * @return the giamGia
	 */
	public double getGiamGia() {
		return giamGia;
	}

	/**
	 * @param giamGia the giamGia to set
	 */
	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}

	/**
	 * @return the tenSp
	 */
	public String getTenSp() {
		return tenSp;
	}

	/**
	 * @param tenSp the tenSp to set
	 */
	public void setTenSp(String tenSp) {
		this.tenSp = tenSp;
	}

	private double getThueNhapKhau()
	{
		double thue;
		thue = donGia * 10/100;
		return thue;
	}

	public void xuat()
	{
		System.out.println("Tên sản phẩm: "+ tenSp);
		System.out.println("Đơn giá: "+ donGia);
		if(giamGia != 0)
			System.out.println("Giảm giá: "+ giamGia);
		else
			System.out.println("Sản phẩm này không được giảm giá");
		System.out.println("Thuế nhập khẩu: "+ getThueNhapKhau());
		System.out.println("***");
	}

	// public void nhap()
	// {
	// 	Scanner scanner = new Scanner(System.in);
	// 	System.out.print("Nhập tên sản phẩm: ");
	// 	tenSp = scanner.nextLine();
	// 	System.out.print("Nhập đơn giá: ");
	// 	donGia = scanner.nextDouble();
	// 	System.out.print("Nhập giảm giá: ");
	// 	giamGia = scanner.nextDouble();
	// }
}
