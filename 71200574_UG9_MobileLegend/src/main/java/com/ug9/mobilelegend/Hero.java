package com.ug9.mobilelegend;

public class Hero extends  Character {
    private int healthBonus;
    private int level=1;
    private int healthMax;
    private int lifeSteal=50;

    public void setHealthBonus(int healthBonus) {
        this.healthBonus = healthBonus;
    }

    public void addDamage(int damageBonus) {
        setDamage(getDamage()+damageBonus);
    }

    public int getLevel(){
        return level;
    }

    public Hero(String name, int health, int damage) {
        super(name, health, damage);
        this.healthMax = getHealth();


    }
}
