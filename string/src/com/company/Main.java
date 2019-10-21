package com.company;

public class Main {

    public static void main(String[] args) {
        // primitive types
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // String is not a primitive type its a class

        String myString = "This is my String";
        System.out.println("My string is = " + myString);

        // java will not convert it to numbers
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        // same with adding integer to a string
        int myInt = 5;
        String number = "5";
        System.out.println(myInt + number);

    }
}
