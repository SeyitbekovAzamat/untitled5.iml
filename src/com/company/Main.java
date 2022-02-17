package com.company;

public class Main {

    public static void main(String[] args) {
        Hero[] hero = {new Warrior(), new Medic(), new Magic()};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
        }
    }

    ;

}

