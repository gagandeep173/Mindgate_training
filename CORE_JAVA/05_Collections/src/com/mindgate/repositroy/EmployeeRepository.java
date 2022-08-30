package com.mindgate.repositroy;

import java.util.ArrayList;
import java.util.List;

import com.mindgate.pojo.Employee;

public class EmployeeRepository {
	private List<Employee> empList = new ArrayList<>();

	public boolean addEmployee(Employee emp) {
		return empList.add(emp);
	}

	public List<Employee> getAllEmp() {
		return empList;
	}

	public boolean deleteEmpById(int employeeId) {
		for (Employee e : empList) {
			if (e.getEmployeeId() == employeeId) {
				return empList.remove(e);
			}
		}
		return false;
	}

	public Employee getEmpByEmployeeId(int employeeId) {
		for (Employee e : empList) {
			if (e.getEmployeeId() == employeeId) {
				return e;
			}
		}
		return null;
	}

	public boolean UpdateEmpById(Employee e) {
		for (Employee employee : empList) {
			if (e.getEmployeeId() == e.getEmployeeId()) {
				employee.setName(e.getName());
				employee.setSalary(e.getSalary());
				return true;
			}
		}
		return false;
	}
}
