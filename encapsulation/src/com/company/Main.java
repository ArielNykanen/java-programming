package com.company;

public class Main {

    public static void main(String[] args) {
        // not protected class and not encapsulation(if you change the name variable in the class you will need to change it in all the files you are using it
        Player player2 = new Player();
        player2.name = "Tim";
        player2.health = 100;
        player2.weapon = "mp5";
        int damage = 10;


        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());

    }
}
