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
	this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
	this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;	
	
	}
	String getFirstName() {
	return firstName;	
	}
	void setFirstName(String firstName) {
		
	}
	String getMiddleName() {
	return middleName;
	}
	void setMiddleName(String firstName) {
		
	}
	String getLastName() {
	return lastName;	
	}
	void setLastName(String firstName) {
		
	}
	String getSSN() {
	return ssn;
	}
	void setSSN(String SSN) {
		
	}
	CheckingAccount getCheckingAccount() {
	
	}
	SavingsAccount getSavingsAccount() {
		
	}
	String toString() {
	system.out.println(firstName + " "+ middleName + " "+ lastName);
	system.out.println(ssn);
	system.out.println("$"+ getBalance());
	
	
	}
}