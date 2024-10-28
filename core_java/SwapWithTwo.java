// Write a program to swap the value of the two variables
package com.java.programs;

import java.util.Scanner;

public class SwapWithTwo {

	public static void main(String[] args) {
		int a, b;
		//		To get the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Before Swap");
		System.out.println("Enter the Value of a : ");
		a= sc.nextInt();
		System.out.println("Enter the Value of b : ");
		b= sc.nextInt();
		//      To swap the value with using Two(2) variable
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping without using 3rd variable: ");
		System.out.println("The value of a Variable is: " +a);
		System.out.println("The value of b variable is: " +b);
	}

}

/*
Output:
Before Swap
Enter the Value of a : 
10
Enter the Value of b : 
20
After Swapping without using 3rd variable: 
The value of a Variable is: 20
The value of b variable is: 10
*/
