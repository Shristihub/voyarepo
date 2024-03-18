package com.employeeapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeapp.model.Employee;

/**
 * Servlet implementation class FormServlet
 */
@WebServlet("/register")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		// to print data in the browser get Writer object
		PrintWriter out = response.getWriter();
		
		//get data from form field
		String name=request.getParameter("employeeName");
		String city=request.getParameter("city");
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		double salary = Double.parseDouble(request.getParameter("salary"));
		String language = request.getParameter("language");
		String [] hobbies = request.getParameterValues("hobby");
		
		// set values
		Employee employee = new Employee();
		employee.setEmployeeName(name);
		employee.setCity(city);
		employee.setHobbies(hobbies);
		employee.setEmployeeId(employeeId);
		employee.setLanguage(language);
	
		// bundling
		request.setAttribute("employee",employee);
		
//		//send to view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
		dispatcher.include(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
