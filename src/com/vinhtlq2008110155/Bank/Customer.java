/*
* create date Sep 30, 2021
* create time: 5:51:03 PM
* author: hinvq
*/
package com.vinhtlq2008110155.Bank;

import java.util.Scanner;

public class Customer {
	String name;
	String address;

	Scanner scanner = new Scanner(System.in);
	
	String getName(){	
		System.out.print("Ho va ten khach hang: ");
		name = scanner.nextLine();
		return name;
	}

	String getAddress(){
		System.out.print("Dia chi thuong tru cua khach hang: ");
		address = scanner.nextLine();
		return address;
	}

	void show(){
		System.out.println("Ho va ten: " +name);
		System.out.println("Dia chi: " +address);
	}
}
