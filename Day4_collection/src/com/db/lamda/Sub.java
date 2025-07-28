package com.db.lamda;

public class Sub  implements ICalculator{
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
