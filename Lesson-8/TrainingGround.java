
package com.company;

import java.util.Scanner;

class TrainingGround {



    public static void checkMortal(Mortal c){
        System.out.print(c.isAlive());
    }

    public static void main(String[] args) {
        Enemy enemy = new Enemy();
        do {
            Hero hero = new Warrior("Antony");
            hero.attackEnemy(enemy);
            hero = new Mage("Yulij");
            hero.attackEnemy(enemy);
            hero = new Archer("Andrew");
            hero.attackEnemy(enemy);
            checkMortal(enemy);
            System.out.println("\n");


        } while (enemy.health > 0);
    }


}
