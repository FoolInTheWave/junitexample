package com.junitexample;

import com.junitexample.testcase.AddNumbersTest;
import com.junitexample.testcase.AssertTest;
import com.junitexample.testcase.HelloTest;
import com.junitexample.testcase.MessageUtilTest;
import com.junitexample.testcase.TestCaseTest;
import com.junitexample.testcase.TestResultTest;

import junit.framework.TestResult;
import junit.framework.TestSuite;

public class TestSuiteRunner {
	
	public static void main(String[] args) {
		TestSuite testSuite = new TestSuite(
				AddNumbersTest.class, 
				AssertTest.class, 
				HelloTest.class, 
				MessageUtilTest.class, 
				TestCaseTest.class, 
				TestResultTest.class
		);
		
		TestResult testResult = new TestResult();
		testSuite.run(testResult);
		
		System.out.println("Number of test cases: " + testResult.runCount());
	}
}
