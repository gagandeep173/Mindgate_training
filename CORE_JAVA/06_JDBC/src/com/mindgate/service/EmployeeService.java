package com.mindgate.service;

import java.util.List;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;
import com.mindgate.repository.EmployeeRepositoryInterface;

public class EmployeeService implements EmployeeServiceInterface {

	private EmployeeRepositoryInterface employeeRepositoryInterface = new EmployeeRepository();

	@Override
	public boolean addEmployee(Employee employee) {
		System.out.println("In Service");
		return employeeRepositoryInterface.addEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeRepositoryInterface.getAllEmployees();
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {

		return employeeRepositoryInterface.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public boolean updateEmployee(String name, int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
