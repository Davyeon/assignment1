package com.meritamerica.assignment1;

public class SavingsAccount extends AccountHolder {
	private double balance;
	private double interestRate = 0.01;
	
	
public SavingsAccount(double openingBalance) {
		this.balance = openingBalance;
}

//getters
public double getBalance() {return balance; }
public double getInterestRate() {return interestRate; }

//allows user to withdraw as long as statement is true
public boolean withdraw (double amount) {
	if (balance > amount) {
		balance = balance - amount;
		return true; 
	}
		else {return false; }
}

//allows user to deposit as long as statement is true
public boolean deposit (double amount) {
	if (amount > 0.0) {
		balance = balance + amount;
		return true;
	}
		else {return false;}
}

//determines the future value using interest rate and x amount of years
public double futureValue (int years) {
	return balance * Math.pow(1 + interestRate,  (double) years);
}

//displays all savings account information
@Override
public String toString() {
	return "\nSavings Account Balance: $" + String.format("%.2f", balance) +
			"\nSavings Account Interest Rate: " + String.format("%.2f", interestRate) +
			"\nSavings Account Balance in 3 years: $" + String.format("%.2f",futureValue(3));
	}
}