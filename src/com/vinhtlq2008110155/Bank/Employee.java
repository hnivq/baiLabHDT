/*
* create date Sep 30, 2021
* create time: 6:02:27 PM
* author: hinvq
*/
package com.vinhtlq2008110155.Bank;

import java.util.Scanner;

public class Employee {
	String name;
	int salary;

	Scanner scanner = new Scanner(System.in);
	
	String getName(){	
		System.out.print("Ho va ten nhan vien: ");
		name = scanner.nextLine();
		return name;
	}

	int getSalary(){
		System.out.print("Luong cua nhan vien: ");
		salary = scanner.nextInt();
		return salary;
	}

	void show(){
		System.out.println("Ho va ten: " +name);
		System.out.println("Dia chi: " +salary);
	}
}
