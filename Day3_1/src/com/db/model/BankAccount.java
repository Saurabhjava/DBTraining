package com.db.model;

public abstract class BankAccount {
    public abstract void calculateInterest();
    public abstract void checkBalance();
    public void displayBankName() {
        System.out.println("ABC Bank");
    }
}