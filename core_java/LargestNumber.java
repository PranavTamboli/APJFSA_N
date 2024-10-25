//Program: Write a program to find largest among three numbers

package com.java.programs;

import java.util.Scanner;

public class LargestNumber {
	
    public static void main(String[] args) {
        // Scanner object to get the input from the user
        Scanner scanner = new Scanner(System.in);

        // To get the input enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Find the largest number using if-else statements
        int largest;
        
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        // Display largest number
        System.out.println("The largest number is: " + largest);
    }
}

/* 
Output:
Enter the first number: 12
Enter the second number: 52
Enter the third number: 85
The largest number is: 85
 */
