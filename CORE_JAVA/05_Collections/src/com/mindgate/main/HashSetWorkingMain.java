package com.mindgate.main;

import java.util.HashSet;
import java.util.Set;

import com.mindgate.pojo.Employee;

public class HashSetWorkingMain {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"X",1000);
		Employee e2=new Employee(1,"X",1000);
		Set<Employee> empSet = new HashSet<>();
		empSet.add(e1);
		empSet.add(e2);
		}
}
