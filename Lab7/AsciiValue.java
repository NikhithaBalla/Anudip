package sample1;
import java.util.Scanner;
public class AsciiValue {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char character = sc.next().charAt(0);
	        // Convert the character to its ASCII value
	        int asciiValue = (int) character;
	        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);

	    }
	}
