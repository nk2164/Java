package com.nk2164.algorithms;

import java.util.Scanner;

import com.nk2164.basics.Account;

public class AccountTest {

	private static Scanner input;

	public static void main(String[] args) {
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

		// display the initial balance of the object
		System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());

		input = new Scanner(System.in);

		double depositAmount = 0.00;

		System.out.println();

		// get input from the user
		System.out.println("Enter the amount you want to deposit for account 1");
		depositAmount = input.nextDouble();
		System.out.printf("%nAdding $%.2f to %s's account: %n ", depositAmount, account1.getName());
		account1.deposit(depositAmount);
		
		System.out.println();
		
		// display the balance
		System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());

		System.out.println();
		
		System.out.println("Enter the amount you want to deposit for account 2");
		depositAmount = input.nextDouble();
		account2.deposit(depositAmount);
		System.out.printf("%nAdding $%.2f to %s's account : %n", depositAmount, account2.getName());

		System.out.println();
		
		// display the balance
		System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());
	}

}
