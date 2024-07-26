package com.SpringWebMvcJspWithEntity.controller;

import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.SpringWebMvcJspWithEntity.entity.Book;
import com.SpringWebMvcJspWithEntity.repository.BookRepository;

@Controller
public class BookController {
	
	@Autowired
	private BookRepository repo;

//	@GetMapping("/book")

//	public ModelAndView getBookById(@RequestParam("id") Integer id) {
//		ModelAndView mv = new ModelAndView();
//		Optional<Book> findbyId = repo.findById(id);
//		if (findbyId.isPresent()) {
//			Book bookObj = findbyId.get();
//			System.out.println(bookObj);
//			mv.addObject("book", bookObj);
//		}
//		mv.setViewName("index");
//		return mv;
	@GetMapping("/book")
	public String getBookById(@RequestParam("id") Integer id,Model model) {
	
		Optional<Book> findbyId = repo.findById(id);
		if (findbyId.isPresent()) {
			Book bookObj = findbyId.get();
			System.out.println(bookObj);
			model.addAttribute("book",bookObj);
		}
	
		return "index";

	}
}
