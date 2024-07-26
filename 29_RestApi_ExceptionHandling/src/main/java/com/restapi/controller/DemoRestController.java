package com.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping("/welcome")
	@ResponseBody
	public String getWelcomeMsg() {

		String msg = "Welcome to My World..!!";

		int i = 10 / 0;

		return msg;
	}
}
