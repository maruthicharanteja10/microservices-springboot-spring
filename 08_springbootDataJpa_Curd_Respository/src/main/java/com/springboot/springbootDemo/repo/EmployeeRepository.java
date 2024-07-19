package com.springboot.springbootDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springboot.springbootDemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//we can write query on method and custom query

}
