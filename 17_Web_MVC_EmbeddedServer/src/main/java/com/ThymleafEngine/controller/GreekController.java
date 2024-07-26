package com.ThymleafEngine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/greet")
public class GreekController {
	
	// http://localhost:8081/greet/hello

	@GetMapping("/hello")
	public String m1(Model model) {
		int i = 10/0;
		model.addAttribute("msg", "Hello, Good Night..");
		return "index";
	}
}
