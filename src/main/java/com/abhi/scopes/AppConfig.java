package com.abhi.scopes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

	@Bean
	public CurrencyConverter currencyConverter() {
		return new CurrencyConverter(); // Singleton by default
	}

	@Bean
	@Scope("prototype") // Prototype scope
	public Transaction transaction() {
		return new Transaction("TXN" + System.currentTimeMillis(), Math.random() * 1000);
	}

}
