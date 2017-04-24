package com.junitexample.testcase;

import org.junit.Test;

import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

public class TestResultTest extends TestResult {
	
	public synchronized void addError(Test test, Throwable throwable) {
		super.addError((junit.framework.Test) test, throwable);
	}
	
	public synchronized void addFailure(Test test, AssertionFailedError error) {
		super.addFailure((junit.framework.Test) test, error);
	}
	
	@Test
	public void test() {
		
	}
	
	public synchronized void stop() {
		
	}
}
