package com.spring.loosecoupling.example;

public class Sodex implements Ipayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodex Card Payment Processed..");
		return true;
	}

}
