package com;

public class Account {
    private static double accBalance=10000;
    private String name;
    public double getBalance() {
        return accBalance;
    }
    public void setName(String n) {
        name=n;
    }
    public String getName() {
        return name;
    }
    public void withdraw(double amt){
        if(accBalance>amt)
            accBalance-=amt;
    }
    public void deposit(int amt) {
        accBalance=accBalance+amt;
    }
}
