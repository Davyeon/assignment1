package com.meritamerica.assignment1;

public class AccountHolder {
	
//instance variables
private String firstName;
private String middleName;
private String lastName;
private String SSN;
private CheckingAccount checkingAccount;
private SavingsAccount savingsAccount;

//default constructor
public AccountHolder() {}

//special constructor
public AccountHolder(
		String firstName, 
		String middleName,
		String lastName,
		String SSN,
		double checkingAccountOpeningBalance,
		double savingsAccountOpeningBalance)
{
	this.firstName= firstName;
	this.middleName= middleName;
	this.lastName= lastName;
	this.SSN= SSN;
	this.checkingAccount= new CheckingAccount(checkingAccountOpeningBalance);
	this.savingsAccount= new SavingsAccount(savingsAccountOpeningBalance); 
}

//Getter-Setter Methods
public String getFirstName() {return firstName; }
public void setFirstName(String firstName) {this.firstName = firstName;}

public String getMiddleName() {return middleName;}
public void setMiddleName(String middleName) {this.middleName = middleName;}

public String getLastName() {return lastName;}
public void setLastName(String lastName) {this.lastName = lastName;}

public String getSSN() {return SSN;}
public void setSSN(String SSN) {this.SSN = SSN;}

public CheckingAccount getCheckingAccount() {
return checkingAccount;}

public SavingsAccount getSavingsAccount() {
return savingsAccount;}

//displays all account holder's information and account balances
@Override
public String toString() {
	return "\nName: " + getFirstName() + " " +  getMiddleName() + " " + getLastName() + "\nSSN= "
			+ getSSN() +  getCheckingAccount() +  getSavingsAccount();
	}

}