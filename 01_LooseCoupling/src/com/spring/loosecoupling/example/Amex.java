package com.spring.loosecoupling.example;

public class Amex implements Ipayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Amex Card Payment Processed..");
		return true;
	}
}
