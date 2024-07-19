package com.spring.ioc.beans.example2;

public class UserDaoImpl implements UserDao {
	public UserDaoImpl() {
		System.out.println("UserDaoImpl constructor..!");
	}

	@Override
	public String findName(int id) {
		return "teja";
	}

}
