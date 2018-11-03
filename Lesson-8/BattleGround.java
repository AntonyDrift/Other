package com.company;

import java.util.Scanner;

public class BattleGround {


    public static void checkMortal(Mortal c) {
        System.out.print(c.isAlive());
    }

    public static void main(String[] args) {

        Enemy enemy = new Enemy();
        int key = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Do you want to attack the enemy?\n1.Yes\t2.No");
            key = scanner.nextInt();
            switch (key) {
                case 1: {
                    Hero hero = new Warrior("Antony");
                    hero.attackEnemy(enemy);
                    hero = new Mage("Yulij");
                    hero.attackEnemy(enemy);
                    hero = new Archer("Andrew");
                    hero.attackEnemy(enemy);
                    checkMortal(enemy);
                    System.out.println("\n");
                    break;
                }

                default:
                    System.out.println("Game Over");
                    enemy.health = 0;
                    break;
            }
        } while (enemy.health > 0);
    }

}