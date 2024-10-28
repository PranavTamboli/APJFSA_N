// Write a program to swap the value by using three(3) variables
package com.java.programs;

import java.util.Scanner;

public class SwapWithThree {

	public static void main(String[] args) {

		int a, b, c;
		//		To get the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swap");
		System.out.println("Enter the first number: ");
		a= sc.nextInt();
		System.out.println("Enter the second number");
		b= sc.nextInt();
		//      To swap the value with using three variable
		c=a;
		a=b;
		b=c;
		System.out.println("After Swapping");
		System.out.println("Enter the first number: " +a);
		System.out.println("Enter the second number: " +b);
	}

}

/*
Output: 
Before Swap
Enter the first number: 
10
Enter the second number
20
After Swapping
Enter the first number: 20
Enter the second number: 10
 */
