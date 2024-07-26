package com.SpringWebMvcJspWithEntity.controller;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.SpringWebMvcJspWithEntity.binding.Student;
import com.SpringWebMvcJspWithEntity.repository.StudentRepository;
import com.SpringWebMvcJspWithEntity.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentRepository repo;

	@Autowired
	private StudentService service;

	// method to load student form
	@GetMapping("/")
	public String loadForm(Model model) {
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses", service.getCourses());
		model.addAttribute("prefTimings", service.getTimings());
	}

	@PostMapping("/save")
	public String handleSubmitBtn(Student s, Model model) {
		boolean issaved = service.saveStudent(s);
		if (issaved) {
			model.addAttribute("msg", "Data saved...");
		}
		init(model);
		return "index";
	}
//	private void loadFormData(Model model) {
//		List<String> coursesList = new ArrayList<>();
//		coursesList.add("Java");
//		coursesList.add("DevOps");
//		coursesList.add("AWS");
//		coursesList.add("Python");
//		List<String> timingsList = new ArrayList<>();
//		timingsList.add("Morning");
//		timingsList.add("Afternoon");
//		timingsList.add("Evening");
//		Student student = new Student();
//		model.addAttribute("courses", coursesList);
//		model.addAttribute("timings", timingsList);
//		model.addAttribute("student", student);
//	}

	// method to save student form data
//	@PostMapping("/save")
//	public String handleSubmit(Student s, Model model) {
//		// logic to save
//		StudentEntity entity = new StudentEntity();
//		// copy data from binding obj to entity obj
//		BeanUtils.copyProperties(s, entity);
//		entity.setTimings(Arrays.toString(s.getTimings()));
//		repo.save(entity);
//		model.addAttribute("msg", "Student Saved");
//		loadFormData(model);
//		return "index";
//	}

	// method to display saved students data
//	@GetMapping("/viewStudents")
//	public String getStudentsData(Model model) {
//		// logic to fetch and send students data
//		List<StudentEntity> studentsList = repo.findAll();
//		model.addAttribute("students", studentsList);
//		return "data";
//	}

}
