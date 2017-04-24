package com.junitexample.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junitexample.controller.EmployeeController;
import com.junitexample.entity.Employee;

public class EmployeeControllerTest {

	@Test
	public void testCalculateYearlySalary() {
		EmployeeController controller = new EmployeeController();
		Employee employee = new Employee();
		
		employee.setName("Bob");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double salary = controller.calculateYearlySalary(employee);
		
		assertEquals(96000, salary, 0.0);
	}

	@Test
	public void testCalculateAppraisal() {
		EmployeeController controller = new EmployeeController();
		Employee employee = new Employee();
		
		employee.setName("Bob");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		
		double appraisal = controller.calculateAppraisal(employee);
		
		assertEquals(500, appraisal, 0.0);
	}

}
