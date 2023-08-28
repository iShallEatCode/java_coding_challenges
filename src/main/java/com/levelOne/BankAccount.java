package com.levelOne;

// The 'BankAccount' class represents a bank account with attributes 'accountNumber' and 'balance'.
// The constructor initializes the account with the provided account number and initial balance.
// Getter methods('getAccountNumber()' and 'getBalance()') allow access to the account number and balance.
// The 'deposit()' method allows adding money to the account, updating the balance accordingly.
// The 'withdraw()' method allows withdrawing money from the account, if sufficient balance is available. 

public class BankAccount {
    // Instance variables to store account info
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
}
