package com.junitexample.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.junitexample.testcase.HelloTest;
import com.junitexample.testcase.MessageUtilTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	HelloTest.class,
	MessageUtilTest.class
})

public class TestSuite {

}
