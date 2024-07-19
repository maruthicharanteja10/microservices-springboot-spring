package com.spring.ioc.beans.example;

public class Car {
	// field injection
	private IEngine eng;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	// constructor injection
	public Car(IEngine eng) {
		System.out.println("Constructor Car Engine...");
		this.eng = eng;
	}

	// setter injection
	public void setEng(IEngine eng) {
		System.out.println("Setter Car Engine...");
		this.eng = eng;
	}

	public void drive() {

		int status = eng.start();

		if (status >= 1) {
			System.out.println("Journey Started..");
		} else {
			System.out.println("Engine Trouble..");
		}
	}
}
