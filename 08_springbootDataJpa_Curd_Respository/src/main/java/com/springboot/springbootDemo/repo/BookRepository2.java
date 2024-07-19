package com.springboot.springbootDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.springbootDemo.entity.Book;

public interface BookRepository2 extends CrudRepository<Book, Integer> {
	// select * from book where book_price > : price
	public List<Book> findByBookPriceGreaterThan(Double price);

	// select * from book where book_price < : price
	public List<Book> findByBookPriceLessThan(Double price);

	// select * from book where book_name = : bookName
	public List<Book> findByBookName(String bookName);

}
