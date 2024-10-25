// Program: Write a program to find whether given number is Armstrong or not.

package com.java.programs;

import java.util.Scanner;
public class ArmstrongNumber{

	public static void main(String[]args){
		int n, a, arm,rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		n = sc.nextInt();
		arm = n;
//		Find the Armstrong number using while loop
		while(n>0){
			a = n % 10;
			rev = rev + (a*a*a);
			n = n / 10;
		}
//		Display Armstrong Number
		if(rev == arm){
			System.out.println("The given number is armstrong");
		}
		else{
			System.out.println("The given number is not armstrong");
		}
	}
}

/* 
Output:
Enter any number: 
153
The given number is armstrong
 */
