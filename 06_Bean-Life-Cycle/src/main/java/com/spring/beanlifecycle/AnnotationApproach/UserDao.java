package com.spring.beanlifecycle.AnnotationApproach;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class UserDao {

	public void getData() {
		System.out.println("getting data from db");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method...");
	}

	@PostConstruct
	public void init() {
		System.out.println("init method....");
	}

}
