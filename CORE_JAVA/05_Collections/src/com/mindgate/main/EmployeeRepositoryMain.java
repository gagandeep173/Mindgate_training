package com.mindgate.main;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repositroy.EmployeeRepository;

public class EmployeeRepositoryMain {
	public static void main(String[] args) {
		EmployeeRepository em = new EmployeeRepository();
		Employee upEmployee = new Employee(4,"rohit",9000);
		Employee e1=new Employee(1, "Gagandeep" , 4000);
		Employee e2=new Employee(2, "Pandey" , 2000);
		Employee e3=new Employee(3, "Vineet" , 1000);
		em.addEmployee(e1);
		em.addEmployee(e2);
		em.addEmployee(e3);
		
//		List<Employee> eList = em.getAllEmp();
//		System.out.println("Before delete");
//		for(Employee e: eList)
//		{
//			System.out.println(e);
//		}
//		
//		boolean res=em.deleteEmpById(2);
//		System.out.println("After delete");
//		for (Employee e : eList) {
//		
//			System.out.println(e);
//		}
//		
		List<Employee> eList = em.getAllEmp();
		System.out.println("Before update");
		for(Employee e: eList)
		{
			System.out.println(e);
		}
		
		boolean result=em.UpdateEmpById(upEmployee);
		System.out.println("after update");
		for (Employee employee : eList) {
			System.out.println(employee);
		}
	}
}
