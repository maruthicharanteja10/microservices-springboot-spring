package com.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	
	@GetMapping("/hiii")
	public String sayHi() {
		return "Hi , How are You ?";
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello , Who are You ?";
	}
	@GetMapping("/contact")
	public String contactus() {
		return "callus :: 4434341";
	}
	@GetMapping("/logincheck")
	public String logincheck() {
		return "Login is loading......";
	}
}
