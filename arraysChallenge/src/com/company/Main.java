package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = getArray();
        int[] sortedArray = getSortedArray(array);
        printArray(sortedArray);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] getSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                int temp = array[i];
                if (temp > array[j]) {
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static int[] getArray() {
        int[] arrayOfNums = new int[5];
        for (int i = 0; i < arrayOfNums.length; i++) {
            System.out.println("Please enter " + i + " numbers to sort:");
            arrayOfNums[i] = scanner.nextInt();
        }
        return arrayOfNums;
    }

}
