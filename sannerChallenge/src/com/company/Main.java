package com.company;

import java.util.Scanner;

public class Main {


    // Challenge store 9 numbers from user input and sum them together

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;
        int totalSum = 0;
        System.out.println("Welcome to calculate 9 numbers together.");
        while (num <= 9) {
            System.out.println("Enter number #" + num + ":");
            boolean hasNext = scanner.hasNextInt();
            if (hasNext) {
                int userNum = scanner.nextInt();
                totalSum += userNum;
            } else {
                System.out.println("You didn't enter number! bye.");
                break;
            }
            if (num >= 9) {
                System.out.println("The total is = " + totalSum);
            }
            num++;
        }
        scanner.close();
}
}
