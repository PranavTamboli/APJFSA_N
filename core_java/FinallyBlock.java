// Write Java Exception Handling program  using finally block.
package com.java.programs;

public class FinallyBlock {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            // Attempt to divide by zero (this will throw an exception)
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle the exception
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            // Code in the finally block always executes
            System.out.println("Finally block executed: Cleaning up resources.");
        }

        System.out.println("Program continues after the try-catch-finally block...");
    }
}


/*Output:
Exception caught: / by zero
Finally block executed: Cleaning up resources.
Program continues after the try-catch-finally block...
*/	
