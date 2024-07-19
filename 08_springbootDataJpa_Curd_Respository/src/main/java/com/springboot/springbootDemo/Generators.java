package com.springboot.springbootDemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootDemo.entity.Student;
import com.springboot.springbootDemo.repo.StudentRepository;

@SpringBootApplication
public class Generators {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Generators.class, args);
		StudentRepository repos=ctx.getBean(StudentRepository.class);
		Student s1=new Student();
		s1.setSName(" teja");
		s1.setAge(22);
		repos.save(s1);
//		
//		List<Student> ss=repos.findAll();
//		ss.forEach(e->System.out.println(e));
	}
}
