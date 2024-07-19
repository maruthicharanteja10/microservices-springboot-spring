package com.spring.loosecoupling.example;

public class Debit implements Ipayment{

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit Card Payment Processed..");
		return true;
	}

}
