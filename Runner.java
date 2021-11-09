package com.companyname.jonathan;

public class Runner {

	public static void main(String[] args) {
		
		Person jim = new Person("Jim", 43, 6.0, 10,"Salesman");
		Person michael = new Person("Michael", 56, 5.9, 9, "Manager");
		Person pam = new Person("Pam", 42, 5.6, 7, "Office Admin" );
		Person dwight = new Person("Dwight", 42, 6.1, 12, "Regional Manager");
		
		dwight.bonjour();
		pam.bonjour();
		pam.iAm();
		michael.bonjour();
		michael.iAm();
		jim.bonjour();
		
		BankAccount one = new BankAccount(2, "Current", "Mark", "Zuck", 25.05F);
	}
	
		
}
