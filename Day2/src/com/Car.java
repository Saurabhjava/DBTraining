package com;

public class Car  {
    public Car() {
        this(5);
        System.out.println("Default Constructor");
    }
    public Car(String name) {
        this();
        System.out.println("Car Name="+name);
    }
    public Car(int noOfGear) {
        System.out.println("No of Gear in Car="+noOfGear);
    }

    /*public static Car getCarObject() {
        return new Car();
    }*/
}
