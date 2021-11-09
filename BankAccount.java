package com.companyname.jonathan;

public class BankAccount {
	private float balance;
	private String accountType;
	private int accountHolderId;
	private String bankName;
	private String firstName;
	private String lastName;
	
	public BankAccount() {}
	
	public BankAccount(int accountHolderId, String accountType,String firstName, String lastName, float balance) {
		this.accountHolderId = accountHolderId;
		this.accountType = accountType;
		this.firstName = firstName;
		this.lastName = lastName;
		this.balance = balance;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstname(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	public void setLastname(String lastName) {
		this.lastName = lastName;
	}
}
