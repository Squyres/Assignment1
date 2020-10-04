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
		if(balance >= amount) {
			balance += amount;
			return true;
		}
		return false;
	}
	boolean deposit(double amount) {
		if(balance >= amount) {
			balance += amount;
			return true;
		}
		return false;
	}
	double futureValue(int years) {
		return balance * Math.pow(1 + SAVINGS_RATE, years);
	}
	public String toString() {
		return "Savings Account Balance: $" + getBalance() + "\n" +
		"Savings Account Interest Rate: " + SAVINGS_RATE + "\n" +
		"Savings Account Balance in 3 years: " + futureValue(3);
	}
}