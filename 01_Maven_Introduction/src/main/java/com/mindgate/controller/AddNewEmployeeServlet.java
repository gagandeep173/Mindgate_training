package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.pojo.Employee;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

@WebServlet("/AddNewEmployeeServlet")
public class AddNewEmployeeServlet extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int employee_id;
		String name;
		double salary;
		employee_id = Integer.parseInt(request.getParameter("employee_id"));
		name = request.getParameter("name");
		salary = Integer.parseInt(request.getParameter("salary"));
//		PrintWriter out= response.getWriter();
//		out.println(employee_id);
//		out.println(name);
//		out.println(salary);
		Employee employee=new Employee(employee_id, name, salary);
		EmployeeServiceInterface employeeServiceInterface= new EmployeeService(); 
		boolean result=employeeServiceInterface.addEmployee(employee);
		if (result) {
			response.sendRedirect("index.jsp");
		}
		else
		{
			PrintWriter out= response.getWriter();
			out.println("Failed to insert the employee details!!!");
		}
		
	}

}

