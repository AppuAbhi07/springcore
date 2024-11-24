package com.abhi.scopes;

public class Transaction {
	private String transactionId;
	private double amount;

	public Transaction(String transactionId, double amount) {
		this.transactionId = transactionId;
		this.amount = amount;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + "]";
	}
}
