package com.java.programs;

public class NarrowingTypeCasting {
	public static void main(String[] args) {
		// Initialize a double variable
		double originalValue = 9.99;

		// Perform narrowing type casting from double to int
		int narrowedValue = (int) originalValue;

		// Display the results
		System.out.println("Original value (double): " + originalValue);
		System.out.println("Narrowed value (int): " + narrowedValue);
	}
}


/* 
Output:
Original value (double): 9.99
Narrowed value (int): 9
 */