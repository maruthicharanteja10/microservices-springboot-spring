package com.boot.ann;

import org.springframework.stereotype.Repository;

@Repository
public class User {
	public User() {
		System.out.println("User constructor");
	}
}
