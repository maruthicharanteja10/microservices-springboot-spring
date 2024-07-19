package com.springboot.springbootDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.springbootDemo.entity.Employee2;

public interface EmployeeRepository2 extends JpaRepository<Employee2, Integer> {
//we can write query on method and custom query
}
