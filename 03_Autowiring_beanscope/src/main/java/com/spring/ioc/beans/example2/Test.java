package com.spring.ioc.beans.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		UserService u = context.getBean(UserService.class);
		u.printName(8);
	}
}
