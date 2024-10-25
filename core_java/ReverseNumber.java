//Program: Write a program to reverse a 3 digit number 

package com.java.programs;

import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args){
		int n, a, r=0;
		//		To get the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any digit number");
		n = sc.nextInt();
		//		Calculating the reverse number
		while(n>0){
			a = n % 10;
			r = r * 10 + a;
			n = n/10;
		}
		//		Display the result
		System.out.println("Reverse number is: " +r);
	}
}

/* 
Output:
Enter any digit number
132
Reverse number is: 231
 */
