package com.springboot.springbootDemo;


import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootDemo.entity.Book;
import com.springboot.springbootDemo.repo.BookRepository3;

//@SpringBootApplication
public class CurdRepoByCustomQueries {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CurdRepoByCustomQueries.class, args);
		System.out.println("hello world..!");

		BookRepository3 repo = ctx.getBean(BookRepository3.class);

		List<Book> books = repo.getAllBooks();
		for (Book b : books) {
			System.out.println(b);
		}
		
		List<Book> books1=repo.getBooks();
		for(Book b:books1) {
			System.out.println(b);
		}
		
		List<Book> books2=repo.findByBookPriceGreaterThan(1500.00);
		for(Book b:books2) {
			System.out.println(b);
		}
	}
}
