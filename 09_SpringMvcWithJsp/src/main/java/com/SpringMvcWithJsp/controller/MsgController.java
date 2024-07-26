package com.SpringMvcWithJsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Welcome to My world..!");
		mv.setViewName("message");
		return mv;
	}
	@GetMapping("/byee")
	public ModelAndView getGreekMsg() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg","Good Byee..!");
		mv.setViewName("message");
		return mv;
	}
}
