package com.junitexample.testcase;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

// Ignore entire class while testing
@Ignore
public class IgnoreClassTest {

	@Test
	public void addTest() {
		int value1 = 1;
		int value2 = 2;
		
		int result = value1 + value2;
		
		assertTrue(result == 6);
	}
	
}
