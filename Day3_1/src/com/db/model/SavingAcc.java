package com.db.model;

// final class can not be inherited
public final class SavingAcc extends BankAccount{
    @Override
    public void calculateInterest() {
        System.out.println("Calculating interest for SavingAcc");
    }

    @Override
    public void checkBalance() {

    }
}
