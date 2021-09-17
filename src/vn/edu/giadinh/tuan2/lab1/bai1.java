package vn.edu.giadinh.tuan2.lab1;

import java.util.Scanner;

public class bai1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ho va ten: ");
		String hoTen = scanner.nextLine();
		System.out.print("Diem TB: ");
		double diemTB = scanner.nextDouble();
		System.out.printf("%s %.3f diem", hoTen, diemTB);
	}	
}
