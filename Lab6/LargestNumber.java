package sample1;
import java.util.Scanner;
public class LargestNumber {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the first number: ");
		        int num1 = sc.nextInt();
		        System.out.print("Enter the second number: ");
		        int num2 = sc.nextInt();
		        System.out.print("Enter the third number: ");
		        int num3 = sc.nextInt();
		        // ternary operator
		        int largest = (num1 > num2) ? 
		                        ((num1 > num3) ? num1 : num3) : 
		                        ((num2 > num3) ? num2 : num3);
		        System.out.println("The largest number is: " + largest);
		}

}


