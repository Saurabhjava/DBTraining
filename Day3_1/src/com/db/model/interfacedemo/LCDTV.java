package com.db.model.interfacedemo;

public class LCDTV implements ISoundable{
    @Override
    public void play() {
        System.out.println("LCD Paly");
    }

    @Override
    public void pause() {
        System.out.println("LCD Pause");
    }

    @Override
    public void stop() {
        System.out.println("LCD Stop");
    }
}
