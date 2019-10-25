package com.company;

public class Vehicle {
    private int engine;
    private int wheels;
    private int windows;

    public Vehicle(int engine, int wheels, int windows) {
        this.engine = engine;
        this.wheels = wheels;
        this.windows = windows;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }
}
