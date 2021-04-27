package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		
	//here we'll make account 1 and print the string
	AccountHolder acc1 = new AccountHolder(
			"Wellington",
			"Jamal",
			"Herring III",
			"123-45-6789",
			 100.00,
			 1000.00);
	  System.out.println(acc1);
	 
	//deposit of 500 into checking, withdrawal of 800 from savings, print
	  acc1.getCheckingAccount().deposit(500.00); 
	  acc1.getSavingsAccount().withdraw(800.00);
	  System.out.println(acc1.getCheckingAccount());
	  System.out.println(acc1.getSavingsAccount());
	  
	//here we'll make account 2 and print the string
	AccountHolder acc2 = new AccountHolder(
			"James",
			"Bond",
			"StPatrick",
			"666-69-3045",
			 200.00,
			 500.00);

	//try to deposit a negative balance, try to withdraw more than balance, print
	  acc2.getCheckingAccount().deposit(-500.00);
	  acc2.getSavingsAccount().withdraw(600.00);
	  System.out.println(acc2);
	}
}