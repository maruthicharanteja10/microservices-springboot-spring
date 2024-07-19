package com.spring.ioc.beans.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		// these will call constructors in the extended classes
		ApplicationContext context = new ClassPathXmlApplicationContext("pay.xml");

		PaymentService service = context.getBean(PaymentService.class);
		service.doPayment(199.0);
	}
}
