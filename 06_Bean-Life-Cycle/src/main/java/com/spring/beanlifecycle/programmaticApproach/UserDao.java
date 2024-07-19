package com.spring.beanlifecycle.programmaticApproach;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UserDao implements InitializingBean, DisposableBean {

	public void getData() {
		System.out.println("getting data from db");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("init method....");
	}

}
