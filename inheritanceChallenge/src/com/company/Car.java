package com.company;

public class Car extends Vehicle {
    private String model;
    public Car(int windows, String model) {
        super(1, 4, windows);
        this.model = model;
    }

    public void drive(int speed) {
        System.out.println("drive() was called from Vehicle. vehicle is driving at speed of " + speed);
    }
}
