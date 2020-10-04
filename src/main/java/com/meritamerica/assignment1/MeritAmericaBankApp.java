package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		AccountHolder smithR = new AccountHolder("Robin", "Evan", "Smith", "234-156-8364", 100.00, 1000.00);
		System.out.println(smithR);
		smithR.getCheckingAccount().deposit(500.00);
		smithR.getSavingsAccount().withdraw(800.00);
		System.out.println(smithR.getCheckingAccount());
		System.out.println(smithR.getSavingsAccount());
		AccountHolder robertsR = new AccountHolder("Rachel", "Sarah", "Roberts", "476-836-3847", 200.00, 500.00);
		robertsR.getCheckingAccount().deposit(-500.00);
		robertsR.getSavingsAccount().withdraw(600.00);
		System.out.println(robertsR);
	}
}