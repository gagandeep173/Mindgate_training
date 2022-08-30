package com.mindgate.main;

import com.mindgate.pojo.Calculation;

public class ExceptionMain {
	public static void main(String[] args) {
		System.out.println("Main start");
		Calculation calculation = new Calculation();
		calculation.accept();
		calculation.calculate();
		calculation.display();
		System.out.println("Main end");
	}
}
