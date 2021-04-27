package com.meritamerica.assignment1;

public class CheckingAccount extends AccountHolder {
	private double balance;
	private double interestRate = 0.0001;
	
	
public CheckingAccount(double openingBalance) {
		this.balance = openingBalance;		
}

//getters
public double getBalance() {return balance; }
public double getInterestRate() {return interestRate; }

//allows user to withdraw as long as statement is true
public boolean withdraw (double amount) {
	if (amount <= balance && amount > 0) {
		balance = balance - amount;
		return true;
	}
		else {return false; }
}

//allows user to deposit as long as statement is true
public boolean deposit (double amount) {
	if (amount > 0.0) {
		balance = balance + amount;
		//System.out.println("\nDeposit of $" + amount + " made");
		return true;	
	}		
		else {return false; }
}
	
//displays the future value of the account using interest rate and x years
public double futureValue (int years) {
	return balance * Math.pow(1 + interestRate, (double) years);
}

//displays all checking account information
@Override
public String toString() {
	return "\nChecking Account Balance: $" + String.format("%.2f",balance) +
			"\nChecking Account Interest Rate: " + String.format("%.4f",interestRate) +
			"\nChecking Account Balance in 3 years: $" + String.format("%.2f",futureValue(3));
	}
}