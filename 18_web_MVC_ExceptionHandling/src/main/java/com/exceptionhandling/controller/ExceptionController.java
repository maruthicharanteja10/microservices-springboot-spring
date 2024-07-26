package com.exceptionhandling.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.val;

@Controller
public class ExceptionController {
//	private Logger logger = LoggerFactory.getLogger(ExceptionController.class);

	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		String msgTxt = "Welcome to My World..!!";
		model.addAttribute("msg", msgTxt);
		return "index";
	}

	@GetMapping("/wish")
	public String getWishMsg(Model model) {
		String msgTxt = "Good Evening..!!";
//		int i = 1 / 0;
		String s = null;
		s.length();
		model.addAttribute("msg", msgTxt);
		return "index";
	}

	// Local Exception Handling
	
//	@ExceptionHandler(value = ArithmeticException.class)
//	public String handleAE(ArithmeticException ae) {
//		String msg = ae.getMessage();
//		logger.error(msg);
//		return "errorPage";
//	}
//	@ExceptionHandler(value = Exception.class)
//	public String handleAE(Exception ae) {
//		String msg = ae.getMessage();
//		logger.error(msg);
//		return "errorPage";
//	}

}
