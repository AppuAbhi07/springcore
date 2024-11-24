package com.abhi.constructorinjections;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
	private final PaymentProcessor paymentProcessor;

	// Constructor Injection
	public PaymentService(PaymentProcessor paymentProcessor) {
		this.paymentProcessor = paymentProcessor;
	}

	public void makePayment(String paymentType) {
		paymentProcessor.processPayment(paymentType);
	}
}
