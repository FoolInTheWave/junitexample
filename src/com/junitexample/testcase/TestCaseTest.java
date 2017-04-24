package com.junitexample.testcase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class TestCaseTest extends TestCase {

	private double value1;
	private double value2;
	
	@Before
	public void setUp() {
		value1 = 2.0;
		value2 = 3.0;
	}
	
	@Test
	public void test() {
		// Count the number of test cases
		System.out.println("Number of test cases: " + this.countTestCases());
		
		// Get test name
		System.out.println("Test case name: " + this.getName());
		
		// Set test case name
		this.setName("newTest");
		System.out.println("Updated test case name: " + this.getName());
	}
	
	@After
	public void tearDown() {
		
	}

}
