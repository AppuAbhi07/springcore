package com.abhi.constructorinjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

 


@Configuration
@ComponentScan(basePackages = "com.abhi.*")
public class ConstructorTest {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConstructorTest.class);

		PaymentService paymentService = context.getBean(PaymentService.class);
		paymentService.makePayment("Credit Card");
	}

}
