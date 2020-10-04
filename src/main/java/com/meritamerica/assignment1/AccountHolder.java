package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount = null;
	private SavingsAccount savingsAccount = null;
			
	AccountHolder() {
	}
	AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccount = new CheckingAccount(checkingAccountOpeningBalance);
		this.savingsAccount = new SavingsAccount(savingsAccountOpeningBalance);
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
		return checkingAccount;
	}
	SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	public String toString() {
		return "Name: " + firstName + " " + middleName + " " + lastName + "\n" +
		"SSN: " + ssn + "\n" +
		"Checking Account Balance: $" + String.format("%.2f", getCheckingAccount().getBalance()) + "\n" +
		"Checking Account Interest Rate: " + (100 * getCheckingAccount().getInterestRate()) + "%\n" +
		"Checking Account Balance in 3 years: $" + String.format("%.2f", getCheckingAccount().futureValue(3)) + "\n" +
		"Savings Account Balance : $" + String.format("%.2f", getSavingsAccount().getBalance()) + "\n" +
		"Savings Account Interest Rate: " + (100 * getSavingsAccount().getInterestRate()) + "%\n" +
		"Savings Account Balance in 3 years: $" + String.format("%.2f", getSavingsAccount().futureValue(3));
	}
}