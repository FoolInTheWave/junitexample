package com.junitexample.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junitexample.utility.MessageUtil;

public class MessageUtilTest {

	@Test(expected = ArithmeticException.class)
	public void testPrintMessage() {
		String message = "Hello world!";
		MessageUtil messageUtil = new MessageUtil(message);
		
		assertEquals(message, messageUtil.printMessage());
	}

}
