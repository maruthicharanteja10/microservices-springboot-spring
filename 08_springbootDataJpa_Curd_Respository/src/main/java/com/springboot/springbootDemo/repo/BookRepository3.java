package com.springboot.springbootDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.springbootDemo.entity.Book;

public interface BookRepository3 extends CrudRepository<Book, Integer> {

	@Query(value = "select * from book ", nativeQuery = true)
	public List<Book> getAllBooks();

	@Query("from Book")
	public List<Book> getBooks();

	@Query("from Book b where b.bookPrice >=1500")
	public List<Book> findByBookPriceGreaterThan(Double price);
}
