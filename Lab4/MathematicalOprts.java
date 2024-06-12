//adding, Subtracting, Multiplying, and dividing the two numbers and the input from the user.
package javafullstack;

import java.util.Scanner;

public class MathematicalOprts {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers a and b: ");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    System.out.println("Addition of a and b: "+(a+b));
	    System.out.println("Subtraction of a and b: "+(a-b));
	    System.out.println("Multiplication of a and b: "+(a*b));
	    System.out.println("Division of a and b: "+(a/b));

	}

}
