package com.company;

public class Dog {
    private static String name;
    private String nickName;

    public Dog(String name, String  nickName) {
        Dog.name = name;
        this.nickName = nickName;
    }

    public void printName() {
        System.out.println("name= " + name);
    }
    public void printNickName() {
        System.out.println("nick name= " + nickName);
    }
}
