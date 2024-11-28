// Write Java Exception Handling program  using  multiple catch block.
package com.java.programs;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int[] numbers = {10, 20, 30};
            int result = numbers[1] / 0; // ArithmeticException
            System.out.println("Result: " + result);

            // Accessing an invalid index
            System.out.println("Accessing element at index 3: " + numbers[3]); // ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            // Catch any other unexpected exceptions
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. Cleaning up resources.");
        }

        System.out.println("Program continues...");
    }
}


/*Output:
ArithmeticException caught: / by zero
Finally block executed. Cleaning up resources.
Program continues...


*/	
