/**
 * 
 */
package com.simeio.training;

import com.opencsv.bean.CsvBindByPosition;

/**
 * @author shristi
 *
 */
public class Employee {
	@CsvBindByPosition(position = 0)
	private String employeeName;
	@CsvBindByPosition(position = 3)
	private String city;
	@CsvBindByPosition(position = 1)
	private Integer employeeId;
	@CsvBindByPosition(position = 4)
	private String email;
	@CsvBindByPosition(position = 2)
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", city=" + city + ", employeeId=" + employeeId + ", email="
				+ email + ", salary=" + salary + "]";
	}
	
	
	

}
