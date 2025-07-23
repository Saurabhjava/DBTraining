package com.db.demo;

public class BankAccount {
    protected int accNo;
    protected String accHolderName;
    protected double balance;

    public BankAccount(int accNo, String accHolderName, double balance) {
        this.accNo = accNo;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance+=amount;
        System.out.println("Deposited: "+amount);
    }
    public void displayBalance() {
        System.out.println(accHolderName+" has balance="+balance);
    }
}
