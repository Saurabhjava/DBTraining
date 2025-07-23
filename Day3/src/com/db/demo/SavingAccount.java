package com.db.demo;

public class SavingAccount extends  BankAccount {
    private double interestRate =6.0;
    public SavingAccount(int accNo, String accHolderName, double balance) {
        super(accNo, accHolderName, balance);
    }

    public void calculateInterest() {
        double interest=balance*interestRate/100;
        System.out.println("Interest on your account ="+interest);
    }
}
