package com.spring.ioc.beans.example2;

public class UserService {
	UserDao dao;

	public UserService() {

	}

	UserService(UserDao d) {
		System.out.println(" Constructor UserService..!");
		this.dao = d;
	}

	public void setDao(UserDao dao) {
		System.out.println("Setter UserService...!");
		this.dao = dao;
	}

	void printName(int id) {
		if (id > 1) {
			System.out.println("Service is implemented ");
		} else {
			System.out.println("service is not-implemented");
		}

	}
}
