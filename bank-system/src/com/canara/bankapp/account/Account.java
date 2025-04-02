package com.canara.bankapp.account;

public class Account {
    public int accountId;
    public String accountType;
    public double balance;

    public void displayAccountDetails() {
        System.out.println("* * * * * * * * * * * *");
        System.out.println("Account ID: " + this.accountId);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: $" + this.balance);
    }
}

