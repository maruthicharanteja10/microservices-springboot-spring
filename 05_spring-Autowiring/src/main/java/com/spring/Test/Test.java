package com.spring.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.AppConfig;
import com.spring.autowiring.ReportService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ReportService service = ctx.getBean(ReportService.class);
		service.ReportDao();
	}
}
