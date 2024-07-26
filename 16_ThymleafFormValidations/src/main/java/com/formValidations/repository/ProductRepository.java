package com.formValidations.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formValidations.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
