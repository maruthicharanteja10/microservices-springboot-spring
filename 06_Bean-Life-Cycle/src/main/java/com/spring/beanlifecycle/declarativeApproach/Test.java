package com.spring.beanlifecycle.declarativeApproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("user.xml");
		UserDao dao = ctx.getBean(UserDao.class);
		dao.getData();

		ConfigurableApplicationContext c = (ConfigurableApplicationContext) ctx;
		c.close();
	}
}
