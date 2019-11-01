package com.company;

public class DeskPhone implements ITelephone {
    private int myNum;
    private boolean isRing;

    public DeskPhone(int myNum) {
        this.myNum = myNum;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing to " + phoneNumber + " on deskphone" );
    }

    @Override
    public void answer() {
    if(isRing) {
        System.out.println("Ansering the desk phone");
        isRing = false;
    }
    }

    @Override
    public boolean callphone(int phoneNumber) {
        if (phoneNumber == myNum) {
            isRing = true;
        } else {
            isRing = false;
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
