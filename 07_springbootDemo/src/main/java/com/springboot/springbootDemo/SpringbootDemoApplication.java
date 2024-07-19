package com.springboot.springbootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringbootDemoApplication.class, args);
		System.out.println("hello world..!");
		System.out.println(ctx.getClass().getName());
		
	}

}
