package com.springboot.EmbeddedH2Database.contr̥oller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.EmbeddedH2Database.entity.Product;
import com.springboot.EmbeddedH2Database.repository.ProductRepository;

@Controller
public class ProductController {
	@Autowired
	private ProductRepository repo;

	@GetMapping("/")
	public String loadForm(Model model) {
		//to load the forms with empty field
		model.addAttribute("p", new Product());
		return "index";
	}

	@GetMapping("/products")
	public String loadProducts(Model model) {
		model.addAttribute("products", repo.findAll());
		return "data";
	}

	@PostMapping("/product")
	public String handleSave(@ModelAttribute("p") Product p, Model model) {
		p = repo.save(p);
		if (p.getPid() != 0) {
			model.addAttribute("msg", "Product Saved");
		}
		return "index";
	}
}
