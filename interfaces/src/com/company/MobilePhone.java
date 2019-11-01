package com.company;

public class MobilePhone implements ITelephone {
    private int myNum;
    private boolean isRing;
    private boolean isOn = false;

    public MobilePhone(int myNum) {
        this.myNum = myNum;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powerd up.");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
        System.out.println("Now ringing to " + phoneNumber + " on mobile phone");
        }
    }

    @Override
    public void answer() {
        if(isRing) {
            System.out.println("Answering the mobile phone");
            isRing = false;
        } else {
            System.out.println("Phone is off.");
        }
    }

    @Override
    public boolean callphone(int phoneNumber) {
        if (phoneNumber == myNum && isOn) {
            isRing = true;
            System.out.println("Melody is sounding");
        } else {
            isRing = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRing;
    }

    @Override
    public boolean isRinging() {
        return isRing;
    }
}
