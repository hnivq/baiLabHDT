package vn.edu.giadinh.tuan2.lab1;
import java.util.Scanner;

public class bai3 {
	public static void main(String[] args){
		double canh;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap canh hinh lap phuong: ");
		canh = scanner.nextDouble();
		double thetich = Math.pow(canh, 3);
		System.out.printf("The tich cua lap phuong = %.3f", thetich);
		scanner.close();
	}
}