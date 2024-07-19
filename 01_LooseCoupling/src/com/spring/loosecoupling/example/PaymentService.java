package com.spring.loosecoupling.example;

public class PaymentService {
	Ipayment payment;

	public PaymentService() {
		// TODO Auto-generated constructor stub
	}

	public PaymentService(Ipayment payment) {
		this.payment = payment;
	}

	public void setIpayment(Ipayment payment) {
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
