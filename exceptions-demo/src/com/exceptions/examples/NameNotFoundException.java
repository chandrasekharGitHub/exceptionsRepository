package com.exceptions.examples;

public class NameNotFoundException extends Exception {

	//private static final long serialVersionUID = 1L;

	public NameNotFoundException() {
		
	}
	
public NameNotFoundException(String message) {
		super(message);
	}
}
