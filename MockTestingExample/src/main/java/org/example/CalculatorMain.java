package org.example;

public class CalculatorMain {
    public static void main(String[] args) {
        ICalculator c=(x,y)->x-y;
        CalculatorService service=new CalculatorService(c);
        System.out.println(service.addService(12,4));
    }
}
