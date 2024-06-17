package sample1;

import java.util.Scanner;

public class BankAccountManager {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Create a bank account.");
	        System.out.print("Enter account type (Checking/Savings): ");
	        String accountType = scanner.nextLine();
	        System.out.print("Enter initial balance: ");
	        double initialBalance = scanner.nextDouble();
	        scanner.nextLine(); 
	        BankAccount account = new BankAccount(accountType, initialBalance);
	        System.out.println("Account created successfully.");

	        while (true) {
	            System.out.println("\nBank Account Manager");
	            System.out.println("1. Deposit Cash");
	            System.out.println("2. Deposit Check");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Check Balance");
	            System.out.println("5. Display Account Details");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice (1-6): ");

	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter amount to deposit in cash: ");
	                    double cashAmount = scanner.nextDouble();
	                    scanner.nextLine(); 
	                    account.deposit(cashAmount);
	                    break;
	                case 2:
	                    System.out.print("Enter check number: ");
	                    String checkNumber = scanner.nextLine();
	                    System.out.print("Enter amount to deposit by check: ");
	                    double checkAmount = scanner.nextDouble();
	                    scanner.nextLine(); 
	                    account.deposit(checkNumber, checkAmount);
	                    break;
	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdrawAmount = scanner.nextDouble();
	                    scanner.nextLine(); 
	                    account.withdraw(withdrawAmount);
	                    break;
	                case 4:
	                    System.out.println("Current Balance: $" + account.checkBalance());
	                    break;
	                case 5:
	                    account.displayAccountDetails();
	                    break;
	                case 6:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please select 1-6.");
	            }
	        }
	    }
}

	
