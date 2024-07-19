package com.springboot.springbootDemo;


import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootDemo.entity.Employee;
import com.springboot.springbootDemo.repo.EmployeeRepository;

//@SpringBootApplication
public class JpaRepo {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JpaRepo.class, args);

		EmployeeRepository repos = ctx.getBean(EmployeeRepository.class);
		Employee e1 = new Employee(2, "teja", 5000.00, "Male", "Sales");
		Employee e2 = new Employee(3, "Charles", 15000.00, "Male", "Admin");
		Employee e3 = new Employee(4, "Smith", 25000.00, "Male", "Marketing");
		Employee e4 = new Employee(5, "Cathy", 35000.00, "Fe-Male", "Account");
		Employee e5 = new Employee(6, "Robert", 45000.00, "Male", "HR");
		Employee e6 = new Employee(7, "David", 55000.00, "Male", "Manager");

		List<Employee> emp = Arrays.asList(e1, e2, e3, e4, e5, e6);
		repos.saveAll(emp);
		System.out.println("records saved..!");
//-----------------------------------------------------
		// Using sorting
//		Sort sort=Sort.by("empSalary","empName").descending();
//		List<Employee> emps = repos.findAll(sort);
//		emps.forEach(System.out::println);
//--------------------------------------------------------
		// Using pagination
//		int pageNo = 2;
//		PageRequest page = PageRequest.of(pageNo - 1, 3);
//		Page<Employee> emps = repos.findAll(page);
//		emps.forEach(System.out::println);
//---------------------------------------------------------
		// Using Query By Example
//		Employee emp = new Employee();
//
//		emp.setEmpGender("Male");
//		Example<Employee> e = Example.of(emp);
//		List<Employee> emps = repos.findAll(e);
//	emps.forEach(System.out::println);
//		emps.forEach(ee -> System.out.println(ee));
//----------------------------------------------------------
		// update
		// repos.save(e1);
//--------------------------------

//		1) Update record in table using custom query
//		2) Delete record in table using custom query
//		3) Insert record in a table using custom query
	}
}
