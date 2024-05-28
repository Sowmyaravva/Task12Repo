package com.example.hrtest;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp= new Employee();
	emp.setId(10);
	emp.setName("User");
	emp.setSalary(75000.00);
	emp.printName();
	emp.printSalary();

	}

}
