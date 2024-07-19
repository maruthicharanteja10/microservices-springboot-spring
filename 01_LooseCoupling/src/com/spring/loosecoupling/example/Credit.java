package com.spring.loosecoupling.example;

public class Credit implements Ipayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Credit Card Payment Processed..");
		return true;
	}

}
