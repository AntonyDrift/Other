package com.company;

public class Warrior extends Hero {

    public Warrior(String nameWarrior) {
        super(nameWarrior);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.setDamage(7);
        enemy.takeDamage();
        System.out.println(getName() + " attack enemy");
        System.out.println("Health of enemy: " + enemy.getHealth(enemy.health));
    }

}
