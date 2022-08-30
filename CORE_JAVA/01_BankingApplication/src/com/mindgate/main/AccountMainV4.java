package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Account;
import com.mindgate.pojo.Savings;

public class AccountMainV4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int accountnumber;
		String name;
		double balance;
		double amount;
		int choice;
		String continueChoice;
		boolean result;
		boolean isSalary;

		System.out.println("Enter the Account Number:");
		accountnumber = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the Name:");
		name = sc.nextLine();

		System.out.println("Enter the Balance:");
		balance = sc.nextDouble();
		System.out.println("Do you want to open salary account(true|false)");
		isSalary = sc.nextBoolean();

		Savings account = new Savings(accountnumber, name, balance, isSalary);

		System.out.println(account);
		do {
			System.out.println("Menu");
			System.out.println("1.Withdraw");
			System.out.println("2.Deposit");
			System.out.println("3.Balance");

			System.out.println("Enter your choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the amount to withdraw");
				amount = sc.nextDouble();
				result = account.withdraw(amount);
				if (result)
					System.out.println("Transaction Successful");
				else
					System.out.println("Transaction Failed");
				break;
			case 2:
				System.out.println("Enter the amount to deposit");
				amount = sc.nextDouble();
				result = account.deposit(amount);
				if (result)
					System.out.println("Transaction Successful");
				else
					System.out.println("Transaction Failed");
				break;
			case 3:
				System.out.println("Balance::" + account.getBalance());
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
			System.out.println("Do you want to continue?");
			continueChoice = sc.next();
		} while (continueChoice.equals("yes"));
	}
}
