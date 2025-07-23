package com.db.model.interfacedemo;

public class Laptop implements ISoundable {
    @Override
    public void play() {
        System.out.println("Laptop Play");
    }

    @Override
    public void pause() {
        System.out.println("Laptop Pause");
    }

    @Override
    public void stop() {
        System.out.println("Laptop Stop");
    }
}
