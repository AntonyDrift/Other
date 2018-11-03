package com.company;

public abstract class Hero {

    public String name;


    public Hero(String nameHero) {
        name = nameHero;

    }

    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);


}

