package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 33;

        switch(value) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("Value was 3");
                break;
            default:
                System.out.println("Value was higher then 3 and it was " + value);
                break;
        }
    }
}
