package com.company;

public class Medic extends Hero {
    private double healPoints = 10;

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
        setHealth(500);
    }

    @Override
    public void setDamage(int damage) {
        super.setDamage(damage);
        setDamage(50);
    }

    public Medic() {


    }


    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    public void applySuperAbility(String resurrection) {
        System.out.println("Resurrection");

    }
    public  String increaseExperience(){
        double tenPercent = (((10 * healPoints) / 100) + healPoints);
        return "Heal Points: " + healPoints + " увеличелся на 10% стало: " + tenPercent;
    }

    public String info (){
        return super.info() + " " +  this.healPoints;
    }


    @Override
    public void applySuperAbility() {
        System.out.println("Resurrection");

    }
}



