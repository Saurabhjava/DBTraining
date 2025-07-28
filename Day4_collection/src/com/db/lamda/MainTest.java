package com.db.lamda;

public class MainTest {
    public static void main(String[] args) {
        ICalculator cal=(x,y)->{
            System.out.println("This is body of lamda");
            return x+y;
        };
        System.out.println("Addition of Two No : "+cal.calculate(12,7));
        cal=(x,y)->x-y;
        System.out.println("Sub of Two No : "+cal.calculate(12,7));
        cal=(x,y)->x*y;
        System.out.println("Multiply of Two No : "+cal.calculate(12,7));
        cal=(x,y)->x/y;
        System.out.println("div of Two No : "+cal.calculate(12,7));
    }
}
