package com.db.model;

public class LoanAcc extends BankAccount{
    @Override
    public void calculateInterest() {
        System.out.println("Calculation interest for Loan Account");
    }

    @Override
    public void checkBalance() {

    }
}
