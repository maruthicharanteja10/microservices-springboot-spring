package com.restApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		String msg = "Welcome to My World..!!";
		return msg;
	}
}
