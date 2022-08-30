package com.mindgate.pojo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculation {
	private int num1;
	private int num2;
	private int result;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		try {
			
		System.out.println("Enter number 1:" +num1);
		 num1=sc.nextInt();
		System.out.println("Enter number 2:" +num2);
		 num2= sc.nextInt();
	}
		catch(InputMismatchException ie)
		{
			System.out.println("Invalid Input");
		}
		finally
		{
			sc.close();
			System.out.println("Thankyou");
		}
	}
	public void calculate()
	{
		System.out.println(" In Calculate:" );
		result=num1+num2;
	}
	public void display()
	{
		System.out.println(" result is: " +result);
	}
}
