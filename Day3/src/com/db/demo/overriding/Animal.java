package com.db.demo.overriding;

public class Animal {
    public void eat() {
        System.out.println("Animal Eat");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog Eat");
    }

    public void bark() {
        System.out.println("Dog Method Bark");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.eat();
        obj = new Dog();
        obj.eat();
        ((Dog) obj).bark(); // casting animal ref to Dog

    }
}