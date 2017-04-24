package com.junitexample.testcase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AnnotationTest {
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("In before class...");
	}
	
	@Before
	public void setUp() {
		System.out.println("In before...");
	}
	
	@Test
	public void test() {
		System.out.println("In test...");
	}
	
	@Test
	public void testSecond() {
		System.out.println("In second test...");
	}
	
	@Ignore
	public void testIgnore() {
		System.out.println("In test ignore...");
	}
	
	@After
	public void tearDown() {
		System.out.println("In after...");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("In after class...");
	}

}
