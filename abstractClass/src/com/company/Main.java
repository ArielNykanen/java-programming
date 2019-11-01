package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Ilo");
        dog.breth();
        dog.eat();

        Parrot parrot = new Parrot("nika");
        parrot.breth();
        parrot.eat();

        Penguin penguin = new Penguin("gulgul");
        penguin.fly();
    }
}
