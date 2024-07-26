package com.SpringWebMvcJspWithEntity.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.SpringWebMvcJspWithEntity.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
