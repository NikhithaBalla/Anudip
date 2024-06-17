package Sample;

	public class SavingsAccount implements BankingInterface {
	    private double balance;
	    private double interestRate;

	    public SavingsAccount(double initialBalance, double interestRate) {
	        this.balance = initialBalance;
	        this.interestRate = interestRate;
	    }
 
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited " + amount + ". New balance: " + balance);
	        }
	    }

	   
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Withdrawal amount exceeded the balance.");
	        }
	    }

	   
	    public double getBalance() {
	        return balance;
	    }
	}
