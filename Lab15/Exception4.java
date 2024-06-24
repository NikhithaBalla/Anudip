//Write a program using exception handling to handle array index out of bounds, Arithmetic exception.

package Sample;

public class Exception4 {

    public static void main(String[] args) {
        
        	        try {
        	            // Arithmetic operation: Division by zero will cause ArithmeticException
        	            int x = 50;
        	            int y = x / 0;  // This line will throw ArithmeticException
        	            System.out.println("Result: " + y); // This line will not be executed

        	            // Array access: Trying to access invalid index will cause ArrayIndexOutOfBoundsException
        	            int z[] = {1, 4, 6, 8};
        	            z[5] = 10;  // This line will throw ArrayIndexOutOfBoundsException
        	            System.out.println("Array element: " + z[5]); // This line will not be executed
        	        } 
        	        catch (ArithmeticException e) {
        	            // Handle division by zero exception
        	            System.out.println("Exception: " + e); // Prints the exception
        	            System.out.println("Error: Division by zero is not allowed.");
        	        } 
        	        catch (ArrayIndexOutOfBoundsException e) {
        	            // Handle array index out of bounds exception
        	            System.out.println("Exception: " + e); // Prints the exception
        	            System.out.println("Error: Array index is out of bounds.");
        	        }
        	        
        	        // This will always be executed regardless of exceptions
        	        System.out.println("End of program.");
        	    }
        	}

        