package com.springboot.springbootDemo;

import org.springframework.boot.SpringApplication;

import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.springbootDemo.entity.Employee2;
import com.springboot.springbootDemo.repo.EmployeeRepository2;

//@SpringBootApplication
public class JpaRepoWithTimeStamping {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JpaRepoWithTimeStamping.class, args);

		EmployeeRepository2 repos = ctx.getBean(EmployeeRepository2.class);
		Employee2 emp = new Employee2();
		emp.setEmplId(8);
		emp.setEmpName("tej");
		emp.setEmpSalary(20000.0);
		emp.setEmpGender("Male");
		emp.setDept(" developer");

		repos.save(emp);
		System.out.println("Record is saved..!");
	}
}
