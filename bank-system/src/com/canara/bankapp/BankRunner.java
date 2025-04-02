package com.canara.bankapp.BankRunner;
import com.canara.bankapp.bank.Bank;
import com.canara.bankapp.customer.Customer;
import com.canara.bankapp.account.Account;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("Main started");

        // Account data
        Account account1 = new Account();
        account1.accountId = 201;
        account1.accountType = "Savings";
        account1.balance = 5000.75;

        Account account2 = new Account();
        account2.accountId = 202;
        account2.accountType = "Current";
        account2.balance = 20000.50;

        // Customer data
        String[] accountsForCustomer1 = {"Savings", "Current"};
        String[] accountsForCustomer2 = {"Savings"};
        String[] bankBranches = {"MG Road", "Whitefield"};

        Customer customer1 = new Customer();
        customer1.customerId = 301;
        customer1.customerName = "Alice";
        customer1.accounts = accountsForCustomer1;

        Customer customer2 = new Customer();
        customer2.customerId = 302;
        customer2.customerName = "Bob";
        customer2.accounts = accountsForCustomer2;

        Customer[] customers = new Customer[2];
        customers[0] = customer1;
        customers[1] = customer2;

        // Bank data
        Bank bank = new Bank();
        bank.bankId = 1;
        bank.location = "Brigade Road";
        bank.branches = bankBranches;
        bank.customers = customers;

        // Display details
        bank.display();
    }
}