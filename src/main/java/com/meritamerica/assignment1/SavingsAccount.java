package com.meritamerica.assignment1;

public class SavingsAccount {
	
	private static final double SAVINGS_RATE = 0.01;
	private double balance;
	
	SavingsAccount(double openingBalance) {
		balance = openingBalance;
	}
	double getBalance() {
		return balance;
	}
	double getInterestRate() {
		return SAVINGS_RATE;
	}
	boolean withdraw(double amount) {
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	boolean deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}
	double futureValue(int years) {
		return balance * Math.pow(1 + SAVINGS_RATE, years);
	}
	public String toString() {
		return "Savings Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
		"Savings Account Interest Rate: " + (100 * SAVINGS_RATE) + "%\n" +
		"Savings Account Balance in 3 years: " + String.format("%.2f", futureValue(3));
	}
}