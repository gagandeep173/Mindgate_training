package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int number1 = Integer.valueOf(request.getParameter("num1"));
		int number2 = Integer.valueOf(request.getParameter("num2"));
		String choice = request.getParameter("operation");
		PrintWriter out = response.getWriter();
		switch (choice) {
		case "Add":
			out.println("Addition of "+number1+" and"+ number2+" is " + (number1 + number2));
			break;
		case "Sub":
			out.println("Subtraction of "+number1+ "and"+ number2+" is " + (number1 - number2));
		}

	}

}
