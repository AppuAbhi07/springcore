package com.abhi.scopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonTest {

	 
	    public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

	        // Singleton Bean: Shared instance
	        CurrencyConverter converter1 = context.getBean(CurrencyConverter.class);
	        CurrencyConverter converter2 = context.getBean(CurrencyConverter.class);

	        System.out.println("Are the instances the same? " + (converter1 == converter2)); // true

	        // Use the shared CurrencyConverter instance
	        double convertedAmount = converter1.convert(100, "USD", "INR");
	        System.out.println("Converted Amount: " + convertedAmount); // 100 USD to INR
	    }
	}
