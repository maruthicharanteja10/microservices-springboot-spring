package com.SpringWebMvcJspWithEntity.service;

import java.util.Arrays;


import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringWebMvcJspWithEntity.binding.Student;
import com.SpringWebMvcJspWithEntity.entity.StudentEntity;

import com.SpringWebMvcJspWithEntity.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;

	public boolean saveStudent(Student student) {
		System.out.println(student);
		StudentEntity se = new StudentEntity();
		BeanUtils.copyProperties(student, se);
		se.setTimings(Arrays.toString(student.getTimings()));
		System.out.println(se);
		repo.save(se);
		return true;

	}

	public List<String> getCourses() {
		return Arrays.asList("Java", "Python", "AWS", "Devops");
	}

	public List<String> getTimings() {
		return Arrays.asList("Morning", "Afternoon", "Evening");
	}
}
