package com.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.exception.UserNotFoundException;
@RestController
public class UserRestController {
	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId") Integer userId) throws Exception {
		if (userId == 10) {
			return "teja";
		} else if (userId == 8) {
			return "charan";
		} else {
			throw new UserNotFoundException("User Not Found");
		}
	}
}
