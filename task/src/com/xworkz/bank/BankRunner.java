package com.xworkz.bank;

import com.xworkz.bank.privatebank.PrivateBank;

public class BankRunner {
    public static void main(String[] args) {
        PrivateBank privateBank = new PrivateBank();
        privateBank.bankName();
        privateBank.services();
        privateBank.interestRates();

        Bank bank = new Bank();
        bank.bankName();
        bank.services();
        bank.interestRates();
    }
}
