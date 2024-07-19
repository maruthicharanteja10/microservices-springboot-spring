package com.springboot.springbootDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.springbootDemo.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
