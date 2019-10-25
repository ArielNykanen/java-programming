package com.company;

public class Main {

    public static void main(String[] args) {
        Dog rex = new Dog("rexy", "rexy");
        Dog hans = new Dog("hans", "hansy");

        // static variables are shared between instances and will be the same in all the instances in any change
        rex.printName();

        // instance variables belong to instance of a class
        rex.printNickName();
    }
}
