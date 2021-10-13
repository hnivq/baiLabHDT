package com.vinhtlq2008110155.Bank;
/*
* create date Sep 30, 2021
* create time: 7:50:18 AM
* author: hinvq
*/
public class Bank {
	public static void main(String[] args) {
		Account account = new Account(00001,10000000);
		account.show();
		account.deposit();
		account.withdraw();
	}
}
