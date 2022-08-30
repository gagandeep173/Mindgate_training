package com.mindgate.main;

import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeMain {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the employeeid:");
		int id=scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter name:");
		String name=scanner.nextLine();
		System.out.println("Enter salary:");
		Double salary=scanner.nextDouble();
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Employee employee = new Employee(id,name,salary);
		boolean result = employeeServiceInterface.addEmployee(employee);
		if (result) {
			System.out.println("Insert Successful!!");
		} else {
			System.out.println("Insert failed!!");
		}
	}
}
