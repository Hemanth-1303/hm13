package com.canara.bankapp.customer;

public class Customer {
    public int customerId;
    public String customerName;
    public String[] accounts;

    public void displayCustomerDetails(){
        System.out.println("* * * * * * * * * * * *");
        System.out.println("Customer ID: " + this.customerId);
        System.out.println("Customer Name: " + this.customerName);
        System.out.println("Accounts:");
        for(String account : accounts) {
            System.out.println("- " + account);
        }
    }
}

