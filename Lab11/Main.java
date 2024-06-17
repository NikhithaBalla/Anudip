package Sample;

public class Main {

	    public static void main(String[] args) {
	        BankingInterface savings = new SavingsAccount(1000, 0.05);
	        BankingInterface current = new CurrentAccount(2000, 500);

	        System.out.println("Savings Account:");
	        savings.deposit(500);
	        savings.withdraw(200);
	        System.out.println("Final Balance: " + savings.getBalance());

	        System.out.println("\nCurrent Account:");
	        current.deposit(1000);
	        current.withdraw(3000);  
	        current.withdraw(5000);  
	        System.out.println("Final Balance: " + current.getBalance());
	    }
	}
