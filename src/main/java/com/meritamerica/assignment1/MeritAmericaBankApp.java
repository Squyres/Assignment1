/*
 * MeritAmericaBankApp.java
 * By: Jameson Squyres and Vanessa Marsh
 * This program will create account holders, and it can be used to access the accounts for 
 * deposits, withdraws, or any of the account information.
 */

package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		AccountHolder smithR = new AccountHolder("Robin", "Evan", "Smith", "234-156-8364", 100, 1000);
		System.out.println(smithR);
		smithR.getCheckingAccount().deposit(500);
		smithR.getSavingsAccount().withdraw(800);
		System.out.println(smithR.getCheckingAccount());
		System.out.println(smithR.getSavingsAccount());
		AccountHolder robertsR = new AccountHolder("Rachel", "Sarah", "Roberts", "476-836-3847", 200, 500);
		robertsR.getCheckingAccount().deposit(-500);
		robertsR.getSavingsAccount().withdraw(600);
		System.out.println(robertsR);
	}
}