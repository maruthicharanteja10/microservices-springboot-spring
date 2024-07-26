package com.SpringWebMvcJspWithEntity.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.SpringWebMvcJspWithEntity.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
