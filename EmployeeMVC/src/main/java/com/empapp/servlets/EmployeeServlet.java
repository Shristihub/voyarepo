package com.empapp.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.empapp.model.Employee;

/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/employeeServlet")
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// set the content type of the browser
		response.setContentType("text/html");
		String empName = request.getParameter("employeeName");
		String city = request.getParameter("city");
		String empId = request.getParameter("employeeId");
		Integer employeeId = Integer.parseInt(empId);
		double salary = Double.parseDouble(request.getParameter("salary"));

		// create employee and set values
		Employee employee =  new Employee();
		employee.setEmployeeId(employeeId);
		employee.setCity(city);
		employee.setEmployeeName(empName);
		employee.setSalary(salary);
				
		// send the employee object to next jsp page
		// bundle it by giving a dummy name
		
		request.setAttribute("employee", employee);
		request.setAttribute("message", "Great Day");
	
		HttpSession session = request.getSession();
		session.setAttribute("message1", "Welcome to EL");
		request.setAttribute("message1", "In request scope");
		RequestDispatcher dispatcher = request.getRequestDispatcher("empexplang.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
