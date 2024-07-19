package com.spring.loosecoupling;

public class App {

	public static void main(String[] args) {
//	Car c = new Car(new PetrolEngine());
//		c.drive();
		Car c1=new Car();
		c1.setEng(new DieselEngine());
		c1.drive();
	}
}
