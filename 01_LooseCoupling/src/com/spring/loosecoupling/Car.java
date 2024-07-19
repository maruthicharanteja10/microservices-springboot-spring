package com.spring.loosecoupling;

public class Car {
	// field injection
	private IEngine eng;

	// constructor injection
//	public Car(IEngine eng) {
//		this.eng = eng;
//	}

	// setter injection

	public void setEng(IEngine eng) {
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
