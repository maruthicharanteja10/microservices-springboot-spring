package com.spring.ioc.beans;

public class PaymentService {
	Ipayment payment;

	public PaymentService() {
		System.out.println("PaymentService :: 0-Constructor");
	}

	public PaymentService(Ipayment payment) {
		System.out.println("PaymentService :: parameterized-Constructor");
		this.payment = payment;
	}

	public void setIpayment(Ipayment payment) {
		System.out.println("Setter method is called");
		this.payment = payment;
	}

	void doPayment(double amount) {
		boolean status = payment.processPayment(amount);
		if (status) {
			System.out.println("Printing Recipt... ");
		} else {
			System.out.println("Payment Declined...");
		}
	}
}
