package com.spring.ioc.beans.autowiring;

public class PaymentService {
	Ipayment pay;

	public PaymentService() {
		System.out.println("PaymentService :: 0-Constructor");
	}

	public PaymentService(Ipayment payment) {
		System.out.println("PaymentService :: parameterized-Constructor");
		this.pay = payment;
	}

	public void setIpayment(Ipayment payment) {
		System.out.println("Setter method is called");
		this.pay = payment;
	}

	void doPayment(double amount) {
		boolean status = pay.processPayment(amount);
		if (status) {
			System.out.println("Printing Recipt... ");
		} else {
			System.out.println("Payment Declined...");
		}
	}
}
