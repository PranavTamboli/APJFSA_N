package com.java.programs;

public class Square {
	public static void main(String[] args) {
		// Define the side length of the square
		double sideLength = 5.0; 

		// Calculate area
		double area = sideLength * sideLength;

		// Calculate perimeter
		double perimeter = 4 * sideLength;

		// Display the results
		System.out.println("Side Length: " + sideLength);
		System.out.println("Area of the square: " + area);
		System.out.println("Perimeter of the square: " + perimeter);
	}
}

/* 
Output:
Side Length: 5.0
Area of the square: 25.0
Perimeter of the square: 20.0 
 */