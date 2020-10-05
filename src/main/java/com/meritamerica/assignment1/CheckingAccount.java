/*
 * CheckingAccount.java
 * By: Jameson Squyres and Vanessa Marsh
 * This class is used as the checking account of an individual account holder.
 * The account holder can deposit, withdraw, find the future value of their account,
 * get the balance, and also get the interest rate.
 */

package com.meritamerica.assignment1;

public class CheckingAccount {
	
	private static final double CHECKING_RATE = 0.0001;	// Set the checking interest rate as final
	private double balance;
	
	CheckingAccount(double openingBalance) {	// Create a new savings account with an initial balance
		balance = openingBalance;
	}
	double getBalance() {
		return balance;
	}
	double getInterestRate() {
		return CHECKING_RATE;
	}
	boolean withdraw(double amount) {	// If funds are available to withdraw, complete the withdraw
		if(amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}
	boolean deposit(double amount) {	// If more than 0 is being deposited, complete the deposit
		if(amount > 0) {
			balance += amount;
			return true;
		}
		return false;
	}
	double futureValue(int years) {	// Calculate the future value by the specified amount of years
		return balance * Math.pow(1 + CHECKING_RATE, years);
	}
	public String toString() {	// Return account information, formatted to 2 decimal places
		return "Checking Account Balance: $" + String.format("%.2f", getBalance()) + "\n" +
		"Checking Account Interest Rate: " + (100 * CHECKING_RATE) + "%\n" +
		"Checking Account Balance in 3 years: " + String.format("%.2f",futureValue(3));
	}
}