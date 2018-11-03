package com.company;

public class Archer extends Hero {

    public Archer(String nameArcher) {
        super(nameArcher);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
            enemy.setDamage(4);
            enemy.takeDamage();
            System.out.println(getName() + " attack enemy");
            System.out.println("Health of enemy: " + enemy.getHealth(enemy.health));
    }
}
