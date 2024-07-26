package com.exceptionhandling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.exceptionhandling.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@GetMapping("/product")
	public String getWishMsg(Model model) {
		String name = service.getProductNameById(100);
		model.addAttribute("msg", name);
		return "index";
	}
}
