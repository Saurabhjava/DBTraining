package com.db.demo.overloading;

public class Calculator {

    public int add(int... a) {
        int total=0;
        for(int x:a){
            total+=x;
        }
        return total;
    }
    public double add(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.add(1,2,3,4,5,6,7,8,9,10));
    }
}
