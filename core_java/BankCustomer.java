// Write a java program to create Bankcustomer class with acno,atype,amt fields using parameterized constructor?
package com.java.programs;

public class BankCustomer {
    private int acno;          // Account number
    private String atype;       // Account type 
    private double amt;         // Account balance

    // Parameterized constructor
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }

    // Method to display customer details
    public void displayDetails() {
        System.out.println("Account Number: " + acno);
        System.out.println("Account Type: " + atype);
        System.out.println("Amount: " + amt);
    }

    // Main method to test the BankCustomer class
    public static void main(String[] args) {
        // Creating an object of BankCustomer with sample data
        BankCustomer customer = new BankCustomer(12345, "Savings", 5000.00);
        customer.displayDetails(); // Displaying customer details
    }
}

/*
Output: 
Account Number: 12345
Account Type: Savings
Amount: 5000.0
*/   
