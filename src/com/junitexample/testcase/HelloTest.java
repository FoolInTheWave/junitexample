package com.junitexample.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest {

	@Test
	public void testHello() {
		String string = "hello";
		
		assertEquals("hello", string);
	}

}
