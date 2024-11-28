// Create Java Program to print the smallest element in an array

package com.java.programs;

public class SmallestArray {
    public static void main(String[] args) {
        // Array of 5 numbers
        int[] numbers = {12, 45, 7, 89, 23};
        
        // Initialize the smallest variable with the first element of the array
        int smallest = numbers[0];
        
        // Traverse the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        
        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}

/*
 Output:
 The smallest element in the array is: 7
*/
