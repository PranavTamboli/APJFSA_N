// Write a Java program to Create Bankcustomer class with acno,atype,amt fields using constructor overloading.

package com.java.programs;

public class ConstructorOverloading {
	private int acno;          // Account number
	private String atype;       // Account type (Savings, Current)
	private double amt;         // Account balance

	// Default constructor
	public ConstructorOverloading() {
		this.acno = 0;
		this.atype = "Unknown";
		this.amt = 0.0;
	}

	// Constructor with account number and account type
	public ConstructorOverloading(int acno, String atype) {
		this.acno = acno;
		this.atype = atype;
		this.amt = 0.0;  // Default amount if not specified
	}

	// Constructor with all fields: account number, account type, and amount
	public ConstructorOverloading(int acno, String atype, double amt) {
		this.acno = acno;
		this.atype = atype;
		this.amt = amt;
	}

	// This method will display customer details
	public void displayDetails() {
		System.out.println("Account Number: " + acno);
		System.out.println("Account Type: " + atype);
		System.out.println("Amount: " + amt);
	}

	// Main method to test the BankCustomer class with different constructors
	public static void main(String[] args) {
		// Using default constructor
		ConstructorOverloading customer1 = new ConstructorOverloading();
		System.out.println("Customer 1 Details:");
		customer1.displayDetails();

		// Using constructor with account number and account type
		ConstructorOverloading customer2 = new ConstructorOverloading(12345, "Savings");
		System.out.println("\nCustomer 2 Details:");
		customer2.displayDetails();

		// Using constructor with all fields
		ConstructorOverloading customer3 = new ConstructorOverloading(67890, "Current", 1500.50);
		System.out.println("\nCustomer 3 Details:");
		customer3.displayDetails();
	}
}

/*
Output:
Customer 1 Details:
Account Number: 0
Account Type: Unknown
Amount: 0.0

Customer 2 Details:
Account Number: 12345
Account Type: Savings
Amount: 0.0

Customer 3 Details:
Account Number: 67890
Account Type: Current
Amount: 1500.5
 */