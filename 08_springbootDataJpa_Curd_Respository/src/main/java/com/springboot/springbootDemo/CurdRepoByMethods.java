package com.springboot.springbootDemo;

import java.util.List;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootDemo.entity.Book;

import com.springboot.springbootDemo.repo.BookRepository2;

//@SpringBootApplication
public class CurdRepoByMethods {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(CurdRepoByMethods.class, args);
		System.out.println("hello world..!");

		BookRepository2 repo = ctx.getBean(BookRepository2.class);
		List<Book> findbybook = repo.findByBookPriceGreaterThan(1000.00);
		for (Book b : findbybook) {
			System.out.println(b);
		}
		System.out.println();
		List<Book> findbybook1 = repo.findByBookPriceLessThan(1000.00);
		for (Book b : findbybook1) {
			System.out.println(b);
		}
		System.out.println();
		List<Book> findbybook2 = repo.findByBookName("tej Biography");
		for (Book b : findbybook2) {
			System.out.println(b);
		}
	}
}
