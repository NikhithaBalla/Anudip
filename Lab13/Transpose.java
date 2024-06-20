package sample1;

import java.util.Scanner;

public class Transpose {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Create a 3x4 matrix
	        int[][] matrix = new int[3][4];

	        // Read the matrix data from the user
	        System.out.println("Enter the elements of the 3x4 matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                matrix[i][j] = scanner.nextInt();
	            }
	        }

	        // Print the original matrix
	        System.out.println("\nOriginal Matrix:");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 4; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        // Print the transposed matrix
	        System.out.println("\nTransposed Matrix:");
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 3; j++) {
	                System.out.print(matrix[j][i] + " ");
	            }
	            System.out.println();
	        }
	    }
	}
