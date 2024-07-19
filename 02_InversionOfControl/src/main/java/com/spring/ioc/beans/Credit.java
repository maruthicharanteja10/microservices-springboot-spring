package com.spring.ioc.beans;

public class Credit implements Ipayment {
	public Credit() {
		System.out.println("CreditCardPayment :: Constructor");
	}

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Credit Card Payment Processed..");
		return true;
	}

}
