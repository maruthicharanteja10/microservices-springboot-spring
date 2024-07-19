package com.springboot.springbootDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springbootDemo.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
