package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
//        int[] myIntArray = {1, 2, 234, 4, 234, 6, 111, 84, 9, 10};
//        myIntArray[1] = 50;
        int[] myIntegers = getInteger(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + " typed value was " + myIntegers[i]);
        }

        double avrage = getAvrage(myIntegers);
        System.out.println("The avrage is " + avrage);
    }

    public static int[] getInteger(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAvrage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
    public static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("array place " + i +  " = " + intArray[i]);
        }
    }
}
