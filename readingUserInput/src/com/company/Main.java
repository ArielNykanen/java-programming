package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key)
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;
            System.out.println("Your name is " + name + ", and you are " + age + " years old.");
        } else {
            System.out.println("You entered invalid Input!");
        }

        scanner.close();
    }
}
