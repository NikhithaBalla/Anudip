//Write a program demonstrating multiple catch statements and finally block.
package Sample;

public class Exception5 {

	public static void main(String[] args) {
	
		        int[] numbers = {10, 20, 30, 40};
		        int divisor = 0; // ArithmeticException
		        int index = 5;   // ArrayIndexOutOfBoundsException

		        try {
		            // Attempt to divide by zero
		            int result = numbers[1] / divisor;
		            System.out.println("Result: " + result); // This line will not be executed

		            // Attempt to access an invalid array index
		            int value = numbers[index];
		            System.out.println("Array Value: " + value); // This line will not be executed
		        } 
		        catch (ArithmeticException e) {
		            // Handle division by zero exception
		            System.out.println("ArithmeticException: " + e);
		            System.out.println("Error: Division by zero.");
		        } 
		        catch (ArrayIndexOutOfBoundsException e) {
		            // Handle invalid array index exception
		            System.out.println("ArrayIndexOutOfBoundsException: " + e);
		            System.out.println("Error: Array index out of bounds.");
		        } 
		        finally {
		            // This block will always be executed regardless of exceptions
		            System.out.println("Finally block executed.");
		            // Resource cleanup or other important code can go here
		        }

		        // This will be executed after the finally block
		        System.out.println("End of program.");
		    }
		}
