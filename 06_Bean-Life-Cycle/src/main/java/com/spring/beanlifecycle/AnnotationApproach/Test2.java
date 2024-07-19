package com.spring.beanlifecycle.AnnotationApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("user2.xml");
		UserDao dao = ctx.getBean(UserDao.class);
		dao.getData();

		ConfigurableApplicationContext c = (ConfigurableApplicationContext) ctx;
		c.close();
	}
}
