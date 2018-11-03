package com.company;

public class Mage extends Hero {

    Enemy enemy = new Enemy();

    public Mage(String nameMage) {
        super(nameMage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.setDamage(6);
        enemy.takeDamage();
        System.out.println(getName() + " attack enemy");
        System.out.println("Health of enemy: " + enemy.getHealth(enemy.health));
    }
}
