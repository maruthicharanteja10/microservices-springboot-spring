package com.springboot.EmbeddedH2Database.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springboot.EmbeddedH2Database.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
