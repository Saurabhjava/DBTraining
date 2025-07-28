package com.db.lamda;

public class Add implements ICalculator{
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
