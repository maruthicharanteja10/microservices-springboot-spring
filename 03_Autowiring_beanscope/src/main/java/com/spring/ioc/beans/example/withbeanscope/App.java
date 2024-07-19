package com.spring.ioc.beans.example.withbeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("car.xml");
		Car c = context.getBean(Car.class);
		Car c1 = context.getBean(Car.class);
		Car c2 = context.getBean(Car.class);
		c.drive();
		//using scope 
		//prototype will print new hascode for every object
		//singleton by default will be give only on hashcode
		//scope can be change in xml file
		System.out.println(c.hashCode());
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
	}
}
