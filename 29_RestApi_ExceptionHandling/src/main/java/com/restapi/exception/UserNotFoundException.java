package com.restapi.exception;

public class UserNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 4442525258L;

	public UserNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public UserNotFoundException(String msg) {
		super(msg);
	}

}
