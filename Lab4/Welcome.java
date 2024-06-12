//Taking a name from the user and displaying a Welcome msg with the user name.
package javafullstack;

import java.util.Scanner;

public class Welcome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the message: ");
	    String a=sc.next();
	    System.out.println("Welcome" +a);

	}

}
