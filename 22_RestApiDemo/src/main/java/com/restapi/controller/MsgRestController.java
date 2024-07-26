package com.restapi.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	public MsgRestController() {
		System.out.println("MsgRestController::Constructor");
	}

	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {
		String msg = "Msg saved succesfully..!!";
		// 201-->to customize status code we can use response entity
		return new ResponseEntity<>(msg, HttpStatus.CREATED);
	}

	@GetMapping("/hi")
	public ResponseEntity<String> getWelcomeMsgggg() {
		String responsebody = "Welcome..!";
		return new ResponseEntity<>(responsebody,HttpStatus.OK);
	}

	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome To My World..!";
		return msg;
	}

	@GetMapping("/greet")
	public String getGreetMsg() {
		String msg = "Good Evening..!!";
		return msg;
	}
}
