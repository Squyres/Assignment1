package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private static final double CHECKING_RATE = 0.0001;
	private double balance;
	
	CheckingAccount(double openingBalance) {
		balance = openingBalance;
	}
	double getBalance() {
		return balance;
	}
	double getInterestRate() {
		return CHECKING_RATE;
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
		return balance * Math.pow(1 + CHECKING_RATE, years);
	}
	public String toString() {
		return "Checking Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
		"Checking Account Interest Rate: " + (100 * CHECKING_RATE) + "%\n" +
		"Checking Account Balance in 3 years: " + String.format("%.2f",futureValue(3));
	}
}