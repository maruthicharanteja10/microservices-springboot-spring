package com.exceptionhandling.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AppExceptionHandler {

	private Logger logger = LoggerFactory.getLogger(AppExceptionHandler.class);

//Global Exception Handling
	@ExceptionHandler(value = Exception.class)
	public String handleAE(Exception ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorPage";
	}

	@ExceptionHandler(value = NullPointerException.class)
	public String handleNPE(NullPointerException ae) {
		String msg = ae.getMessage();
		logger.error(msg);
		return "errorPage";
	}
}
