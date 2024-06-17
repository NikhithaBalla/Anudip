package Sample;

	public class CurrentAccount implements BankingInterface {
	    private double balance;
	    private double overdraftLimit;

	    public CurrentAccount(double initialBalance, double overdraftLimit) {
	        this.balance = initialBalance;
	        this.overdraftLimit = overdraftLimit;
	    }

	    
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited " + amount + ". New balance: " + balance);
	        }
	    }

	  
	    public void withdraw(double amount) {
	        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
	            balance -= amount;
	            System.out.println("Withdrew " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Withdrawal amount exceeded the overdraft limit.");
	        }
	    }

	   
	    public double getBalance() {
	        return balance;
	    }
	}
