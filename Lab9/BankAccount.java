package sample1;
public class BankAccount {
    private String accountType;
    private double balance;

    
    public BankAccount() {
        this.accountType = "Checking";
        this.balance = 0.0;
    }

    
    public BankAccount(String accountType) {
        this.accountType = accountType;
        this.balance = 0.0;
    }

    
    public BankAccount(String accountType, double initialBalance) {
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " in cash.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void deposit(String checkNumber, double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " by check (Check No: " + checkNumber + ").");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ".");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

  
    public double checkBalance() {
        return balance;
    }

   
    public void displayAccountDetails() {
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}
