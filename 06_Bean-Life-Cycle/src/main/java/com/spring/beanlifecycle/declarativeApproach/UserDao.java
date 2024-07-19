package com.spring.beanlifecycle.declarativeApproach;

public class UserDao {
	public void init() {
		System.out.println("getting db connection...");
	}

	public void getData() {
		System.out.println("getting data from db");
	}

	public void destroy() {
		System.out.println("Closing db connection");
	}
}
