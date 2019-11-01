package com.company;

public class Main {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callphone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(123);
//        timsPhone.powerOn();
        timsPhone.callphone(123);
        timsPhone.answer();
    }
}
