package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
			
	AccountHolder() {
	}
	AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	String getMiddleName() {
		return middleName;
	}
	void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	String getSSN() {
		return ssn;
	}
	void setSSN(String ssn) {
		this.ssn = ssn;
	}
	CheckingAccount getCheckingAccount() {
		
	}
	SavingsAccount getSavingsAccount() {
	
	}
	public String toString() {
		return "Name: " + firstName + " " + middleName + " " + lastName + "\n" +
		"SSN: " + ssn + "\n" +
		"Checking Account Balance: $" + getCheckingAccount().getBalance() + "\n" +
		"Checking Account Interest Rate: " + getCheckingAccount().getInterestRate() + "\n" +
		"Checking Account Balance in 3 years: $" + getCheckingAccount().futureValue(3) + "\n" +
		"Savings Account Balance : $" + getSavingsAccount().getBalance() + "\n" +
		"Savings Account Interest Rate: " + getSavingsAccount().getInterestRate() + "\n" +
		"Savings Account Balance in 3 years: $" + getSavingsAccount().futureValue(3);
	}
}