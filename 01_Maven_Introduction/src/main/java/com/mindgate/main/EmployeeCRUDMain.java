package com.mindgate.main;

import java.util.List;
import java.util.Scanner;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

public class EmployeeCRUDMain {
	public static void main(String[] args) {
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
		Scanner scanner = new Scanner(System.in);
		List<Employee> allEmployees;
		int choice;
		String continueChoice;
		do {

			System.out.println("1.Add new employee");
			System.out.println("2.Update employee");
			System.out.println("3.Delete employee");
			System.out.println("4.Select one employee");
			System.out.println("5.Select all employees");
			System.out.println("Enter your choice::-----------");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the employeeid:");
				int id = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter name:");
				String name = scanner.nextLine();
				System.out.println("Enter salary:");
				Double salary = scanner.nextDouble();
				// EmployeeServiceInterface employeeServiceInterface = new EmployeeService();
				Employee employee = new Employee(id, name, salary);
				boolean result = employeeServiceInterface.addEmployee(employee);
				if (result) {
					System.out.println("Insert Successful!!");
				} else {
					System.out.println("Insert failed!!");
				}

				break;
			case 2:

				System.out.println("set name to");
				name = scanner.nextLine();
				scanner.nextLine();

				System.out.println("emp id");
				id = scanner.nextInt();
				scanner.nextLine();

				//result = employeeServiceInterface.updateEmployee(Employee);

				//if (result) {
//					System.out.println("update succesfull");
//				} else {
//					System.out.println("update failed");
//				}
//				break;
			case 3:
				System.out.println("Enter the employeeid:");
				id = scanner.nextInt();
				result = employeeServiceInterface.deleteEmployeeByEmployeeId(id);
				if (result) {
					System.out.println("delete Successful!!");
				} else {
					System.out.println("delete failed!!");
				}

				break;
			case 4:
//				System.out.println("Get Employee ::");
//				//employee = employeeServiceInterface.getEmployee();
//				System.out.println(employee);
//				break;

			case 5:
				allEmployees = employeeServiceInterface.getAllEmployees();
				for (Employee e : allEmployees) {
					System.out.println(e);
				}
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("Do you want to continue?");
			continueChoice = scanner.next();
		}

		while (continueChoice.equals("yes"));
	}
}
