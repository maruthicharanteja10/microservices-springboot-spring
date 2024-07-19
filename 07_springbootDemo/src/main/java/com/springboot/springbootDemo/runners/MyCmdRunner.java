package com.springboot.springbootDemo.runners;

import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Repository;

@Repository
public class MyCmdRunner implements CommandLineRunner{
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyCmdRunner... run() method...");
	}
}

