package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.factory.AccountFactory;
import com.mindgate.pojo.Account;
import com.mindgate.pojo.Current;
import com.mindgate.pojo.Savings;

public class AccountFactoryMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AccountFactory accountFactory = new AccountFactory();
		System.out.println("Press 1 for Savings acc");
		System.out.println("Press 2 for current acc");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		Account account = accountFactory.getAccount(choice);
		if (account instanceof Savings)

			System.out.println("Savings object created!!!");

		if (account instanceof Current)

			System.out.println("Current object created!!!");

	}
}
