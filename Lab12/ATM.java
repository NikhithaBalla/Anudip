package Sample;
public class ATM extends BankAccount {

	    public ATM(String accountNumber, double balance, String accountHolder, String bankName) {
	        super(accountNumber, balance, accountHolder, bankName);
	    }

	    public void withdraw(double amount) {
	        double currentBalance = getBalance();
	        if(amount > 0 && currentBalance >= amount) {
	            currentBalance -= amount;
	            // Using protected method to demonstrate access
	            setBalance(currentBalance);
	        }
	    }

	    public static void main(String[] args) {
	        ATM atm = new ATM("123456789", 1000.0, "Rani", "Bank of India");

	        System.out.println("Account Number: " + atm.accountNumber);

	        System.out.println("Account Holder: " + atm.accountHolder);

	        System.out.println("Bank Name: " + atm.bankName);
	        atm.deposit(500.0);
	        System.out.println("Balance after deposit: " + atm.getBalance());

	        atm.withdraw(300.0);
	        System.out.println("Balance after withdrawal: " + atm.getBalance());
	    }
	}