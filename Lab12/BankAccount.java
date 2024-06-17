package Sample;

public class BankAccount {

	    public String accountNumber;

	    private double balance;

	    protected String accountHolder;

	    String bankName;

	    public BankAccount(String accountNumber, double balance, String accountHolder, String bankName) {
	        this.accountNumber = accountNumber;
	        this.balance = balance;
	        this.accountHolder = accountHolder;
	        this.bankName = bankName;
	    }

	 
	    public void deposit(double amount) {
	        if(amount > 0) {
	            balance += amount;
	        }
	    }

	    protected void setBalance(double balance) {
	        this.balance = balance;
	    }

	   	    protected void setAccountHolder(String accountHolder) {
	        this.accountHolder = accountHolder;
	    }

	    void setBankName(String bankName) {
	        this.bankName = bankName;
	    }

	    public double getBalance() {
	        return balance;
	    }
	}