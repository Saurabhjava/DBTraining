package com.db.demo;

public class AccountMain {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount(1234,"Amit",1000);
        s.displayBalance();
        s.deposit(10000);
        s.displayBalance();
        s.calculateInterest();
    }
}
