package vn.edu.giadinh.tuan2.lab2;

import java.util.Scanner;



public class bai1 {
	public static void main(String[] args){
		double a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap he so a, b theo dang ax + b = 0");
		System.out.print("He so a: ");
		a = scanner.nextDouble();
		System.out.print("He so b: ");
		b = scanner.nextDouble();
		if(a == 0)
			if(b == 0)
				System.out.println("Phuong trinh vo so nghiem");
			else
				System.out.println("Phuong trinh vo nghiem");
		else
			System.out.printf("x = %.3f", -b/a);
	}
}
