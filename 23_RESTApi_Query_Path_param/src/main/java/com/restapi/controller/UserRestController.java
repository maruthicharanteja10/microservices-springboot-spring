package com.restapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.binding.User;

@RestController
public class UserRestController {
	private Map<Integer, User> dataMap = new HashMap<>();

	@PostMapping("/user")
	public ResponseEntity<String> addUser(@RequestBody User user) {
		System.out.println(user);
		dataMap.put(user.getId(), user);
		return new ResponseEntity<String>("User saved..!", HttpStatus.CREATED);
	}

//using Query parameters
//	@GetMapping("/user")
//	public User getUser(@RequestParam("userId") Integer userId) {
//		// localhost:8080/user?userId=8
//		User user = dataMap.get(userId);
//		return user;
//	}
//
//	@GetMapping("/user")
//	public User getUserData(@RequestParam("userId") Integer userId, @RequestParam("username") String name) {
//		// localhost:8080/user?userId=7&username=charan
//		User user = dataMap.get(userId);
//		return user;
//	}

//Using path parameters
	@GetMapping("/user/{id}/data")
	public User getUserInfo(@PathVariable("id") Integer userId) {
		// localhost:8080/user/8/data
		User user = dataMap.get(userId);
		return user;
	}

}
