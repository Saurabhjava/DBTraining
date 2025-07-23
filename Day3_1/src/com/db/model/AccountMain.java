package com.db.model;

public class AccountMain {
    public static void main(String[] args) {
        BankAccount ba=new SavingAcc();
        ba.calculateInterest();
        ba=new LoanAcc();
        ba.calculateInterest();
    }
}
