package com.company;

public  class Hero implements HavingSuperAbility {
    private int health;
    private int damage;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;}

    @Override
    public void applySuperAbility() {

    }
}

