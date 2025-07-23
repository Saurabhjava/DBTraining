package com;

public class HelloWorld {

    public static void main(String[] args) {
        // accBalance=10000--->15000
        Account acc=new Account();
        acc.setName("Saurabh");
        acc.deposit(5000);
        System.out.println("Name="+acc.getName());
        System.out.println("Balance="+acc.getBalance());

        Account acc1=new Account();
        acc1.setName("Utkarsh");
        System.out.println("Name="+acc1.getName());
        System.out.println("Balance="+acc1.getBalance());
    }
}
