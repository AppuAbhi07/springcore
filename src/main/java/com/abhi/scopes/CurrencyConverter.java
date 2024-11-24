package com.abhi.scopes;

public class CurrencyConverter {

	public double convert(double amount, String from, String to) {
		// Mock conversion logic
		if (from.equals("USD") && to.equals("INR")) {
			return amount * 82.5; // Example conversion rate
		}
		return amount; // Default conversion (no change)
	}

}
