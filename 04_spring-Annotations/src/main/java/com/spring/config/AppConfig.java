package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.Annotations.Engine;

@Configuration
@ComponentScan(basePackages = { "com.spring", "com.boot" })
public class AppConfig {
	public AppConfig() {
		System.out.println("Appconfig Constructor");
	}

	@Bean
	public Engine getEngine() {
		Engine eng = new Engine();
		return eng;
	}
}
