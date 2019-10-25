package com.company;

public class Fiat extends Car {
    public Fiat(int windows, String model) {
        super(windows, model);
    }

    public void putTheKeyIn() {
        System.out.println("putTheKeyIn() was called from fiat.");
    }

    public void startTheEngine() {
        System.out.println("startTheEngine() was called from fiat.");
        boolean started = false;
        double counter = Math.ceil(Math.random() * 5);
        try {
            while (started == false) {
                System.out.println("pushing the gas pedal trying to start...");
                Thread.sleep(2000);
                if (counter <= 0) {
                    started = true;
                    System.out.println("The engine was started!");
                } else {
                    counter--;
                }
            }
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    @Override
    public void drive(int speed) {
    putTheKeyIn();
    startTheEngine();
    super.drive(speed);
    }
}
