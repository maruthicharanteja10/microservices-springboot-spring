package com.springboot.springbootDemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootDemo.entity.Book;
import com.springboot.springbootDemo.repo.BookRepository;

@SpringBootApplication
public class SpringbootDemoByUsingCurdRepo {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootDemoByUsingCurdRepo.class, args);
		System.out.println("hello world..!");

		BookRepository repo = ctx.getBean(BookRepository.class);
		System.out.println(repo.getClass().getName());
//		 To save a record
		Book b = new Book();
		b.setBookId(18);
		b.setBookName("Virat Biography");
		b.setBookPrice(2000.0);
		repo.save(b);
		System.out.println("Record is inserted...1");
//-------------------------------------------------------
//		Book b1 = new Book();
//		b1.setBookId(10);
//		b1.setBookName("tej Biography");
//		b1.setBookPrice(1500.0);
//		Book b2 = new Book();
//		b2.setBookId(8);
//		b2.setBookName("Springboot");
//		b2.setBookPrice(800.0);
//		List<Book> bookslist = new ArrayList<>();
//		bookslist.add(b1);
//		bookslist.add(b2);
//		repo.saveAll(bookslist);
//		System.out.println("Records are inserted...1");
//----------------------------------------------------------
//		boolean status=repo.existsById(81);
//		System.out.println(status);
//----------------------------------------------------------
//		System.out.println(repo.count());
//----------------------------------------------------------
		// to find details by id
//		Optional<Book> findbyId = repo.findById(18);
//		if (findbyId.isPresent()) {
//			System.out.println(findbyId.get());
//		}
//--------------------------------------------------------
//		Iterable<Book> findallByid = repo.findAllById(Arrays.asList(8, 10, 90));
//		for (Book b : findallByid) {
//			System.out.println(b);
//		}
//--------------------------------------------------------------
//		Iterable<Book> findallByids =repo.findAll();
//		for (Book b : findallByids) {
//			System.out.println(b);
//		}
//-----------------------------------------------------------------
//		deleteById(ID) 
//	    deleteAllById (Iterable ids)
//		delete(E) 
//		deleteAll(Iterable entities)
//		deleteAll ( ) :

//		if (repo.existsById(10)) {
//			repo.deleteById(10);
//		} else {
//			System.out.println("Record is not present...!");
//		}
//
	}

}
