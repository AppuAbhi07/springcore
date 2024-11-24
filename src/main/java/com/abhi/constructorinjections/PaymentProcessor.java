package com.abhi.constructorinjections;

import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {
    public void processPayment(String paymentType) {
        System.out.println("Processing " + paymentType + " payment...");
    }
}
