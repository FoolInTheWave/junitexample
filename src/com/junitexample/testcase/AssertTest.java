package com.junitexample.testcase;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertTest {

	@Test
	public void testAssert() {
		int value1 = 5;
		int value2 = 6;
		
		String string1 = new String("abc");
		String string2 = new String("abc");
		String string3 = null;
		String string4 = "abc";
		String string5 = "abc";
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};
		
		// Check that two objects are equal
		assertEquals(string1, string2);
		
		// Check that a condition is true
		assertTrue(value1 < value2);
		
		// Check that a condition is false
		assertFalse(value1 > value2);
		
		// Check that an object isn't null
		assertNotNull(string1);
		
		// Check that an object is null
		assertNull(string3);
		
		// Check if two object references point to the same object
		assertSame(string4, string5);
		
		// Check if two object references point to a different object
		assertNotSame(string1, string3);
		
		// Check if two arrays are equal
		assertArrayEquals(expectedArray, resultArray);
	}

}
