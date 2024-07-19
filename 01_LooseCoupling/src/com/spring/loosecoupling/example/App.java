package com.spring.loosecoupling.example;

public class App {
	public static void main(String[] args) {
		// constructor injection
		Ipayment p1 = new Amex();
		Ipayment p2=new Debit();
		
		//constructor injection
		PaymentService ps = new PaymentService(p1);
//		ps.doPayment(200);
		// setter injection
		ps.setIpayment(p2);
		ps.doPayment(2000);
	}
}
