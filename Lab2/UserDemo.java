//TO CHECK WHEATHER USER LOGGED IN OR NOT USING SUITABLE CONTROL STATEMENTS
package javafullstack;

import java.util.Scanner;

public class UserDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String username="abc";
		String password="abc123";
		System.out.println("Enter username: ");
		String a=sc.next();
		System.out.println("Enter password: ");
		String b=sc.next();
		if((a.equals(username))&&(b.equals(password)))
		{
			System.out.println("User Logged in! Successfully");
		}
		else
		{
			System.out.println("Invalid username and password! Login failed");
		}

	}

}
