package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();


        Hero[] hero = {medic, new Warrior(), new Magic()};
        for (int i = 0; i < hero.length; i++) {
            hero[i].applySuperAbility();
            System.out.println(hero[i].info());
            if (hero[i] == medic) {
                System.out.println(medic.increaseExperience());

            }
        }
    }


}

