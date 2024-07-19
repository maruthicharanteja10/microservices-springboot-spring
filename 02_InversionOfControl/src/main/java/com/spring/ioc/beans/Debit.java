package com.spring.ioc.beans;

public class Debit implements Ipayment {
	public Debit() {
		System.out.println("DebitCardPayment :: Constructor");
	}

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Debit Card Paymenst Processed..");
		return true;
	}

}
