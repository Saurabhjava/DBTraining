package com.db.model.interfacedemo;

public class Main {
    public static void main(String[] args) {
        ISoundable sound=new Laptop();
        sound.play();
        sound=new LCDTV();
        sound.play();
    }
}
