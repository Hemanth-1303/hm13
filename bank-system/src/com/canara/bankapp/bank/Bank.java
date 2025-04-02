package com.canara.bankapp.bank;
import com.canara.bankapp.customer.Customer;

public class Bank {

        public int bankId;
        public String location;
        public String[] branches;
        public Customer[] customers;

        public void display(){
            System.out.println("* * * * * * * * * * * *");
            System.out.println("Bank ID: " + this.bankId);
            System.out.println("Bank Location: " + this.location);
            for(String branch : branches) {
                System.out.println("Bank Branch: " + branch);
            }
            if (customers != null) {
                for (Customer customer : customers) {
                    System.out.println("Customer Name: " + customer.customerName);
                }
            } else {
                System.out.println("No customers available.");
            }
        }
    }


