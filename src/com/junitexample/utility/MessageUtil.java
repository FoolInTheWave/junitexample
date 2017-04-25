package com.junitexample.utility;

public class MessageUtil {
	
	private String message;
	
	public MessageUtil(String message) {
		this.message = message;
	}
	
	public String printMessage() {
		System.out.println(message);
		
		// Force divide by zero exception
		int x = 0;
		int y = 1 / 0;
		
		return message;
	}
	
}
