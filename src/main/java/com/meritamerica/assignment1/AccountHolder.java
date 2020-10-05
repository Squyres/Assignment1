/*
 * AccountHolder.java
 * By: Jameson Squyres and Vanessa Marsh
 * This class contains all of the information on an account holder, and creates their checking
 * and savings account. Information on the account can be set and retrieved through this class.
 */

package com.meritamerica.assignment1;

public class AccountHolder {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount = null;
	private SavingsAccount savingsAccount = null;
			
	AccountHolder() {	// Default constructor
	}
	/*
	 * Create a new AccountHolder with names, ssn, and use the opening balances to create a new checking and savings account
	 * for the individual account holder.
	 */
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
	CheckingAccount getCheckingAccount() {	// Return the checking account of an account holder
		return checkingAccount;
	}
	SavingsAccount getSavingsAccount() {	// Return the savings account of an account holder
		return savingsAccount;
	}
	/*
	 * Return information on the account holder, including name, ssn, balance, interest rate, and future balance
	 * formatted to 2 decimal places.
	 */
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