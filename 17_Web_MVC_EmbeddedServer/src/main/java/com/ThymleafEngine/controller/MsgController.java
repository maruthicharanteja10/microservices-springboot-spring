package com.ThymleafEngine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController -->always returns responsebody
@RequestMapping("/welcome")
public class MsgController {
	// http://localhost:8081/welcome/hello

	@GetMapping(value = { "/hi", "/hello", "/" })
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "Hello, Good Evening");
		return "index";
	}

	// when we want direct response to the ui then we can use @responsebody
	@GetMapping("/hhello")
	@ResponseBody
	public String sayHello() {
		String msg = "Hello , How are You?";
		return msg;

	}
}
