package com.company;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breth() {
        System.out.println(getName() + " is breathing");
    }

    public void fly() {
        System.out.println("flapping hes wings.");
    }
}
