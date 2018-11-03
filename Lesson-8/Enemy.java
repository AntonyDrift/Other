package com.company;

public class Enemy implements Mortal {
    int health;
    int damage;

    public Enemy() {
        health = 100;
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void takeDamage() {
        health -= damage;
        if (health <= 0) {
            System.out.println("You win!");
        }
    }

    public int getHealth(int health) {
        return this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }


}

