package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		AccountHolder smithJ = new AccountHolder("John", "Ryan", "Smith", "1111111111", 100.00, 1000.00);
		AccountHolder();
		CheckingAccount.deposit(500.00);
		SavingsAccount.withdraw(800.00);
		CheckingAccount();
		SavingsAccount();
		AccountHolder robertsR = new AccountHolder("Rachel", "Sarah", "Roberts", "2222222222", 200.00, 500.00);
		CheckingAccount.deposit(-500.00);
		SavingsAccount.withdraw(600.00);
		AccountHolder();
	}
}