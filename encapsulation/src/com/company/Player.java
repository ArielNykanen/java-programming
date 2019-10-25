package com.company;

public class Player {

    public String name;
    public double health;
    public String weapon;

    public void loseHealth(double damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
        }
    }

    public double healthRemaining() {
        return this.health;
    }
}
