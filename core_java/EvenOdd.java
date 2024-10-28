// Write a program for even and odd by using conditional operator

package com.java.programs;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		int a;
		String c;
		//		Getting the input from the user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a :");
		a = sc.nextInt();
		// 		Using the conditional operator to check if the number is even or odd
		c = (a%2==0) ? "Even" : "Odd";
		System.out.println(c);

	}
}

/*
Output: 
Enter the value of a :
4
Even
Enter the value of a :
5
Odd
 */