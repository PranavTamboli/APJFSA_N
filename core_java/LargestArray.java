// create Java Program to print the largest element in an array
package com.java.programs;

public class LargestArray {
    public static void main(String[] args) {
        // Array of 5 numbers
        int[] numbers = {12, 45, 7, 89, 23};
        
        // Initialize the largest variable with the first element of the array
        int largest = numbers[0];
        
        // Traverse the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
    
        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }
}

/*
Output:
The largest element in the array is: 89
*/