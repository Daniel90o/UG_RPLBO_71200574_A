package com.ug9.mobilelegend;

public class NPC extends Character{
    public NPC(String name, int health, int damage) {
        super(name, health, damage);
    }
    @Override
    public void attack(Character enemy) {
        if(enemy instanceof Melee || enemy instanceof Ranged) this.setDamage(this.getDamage()+100);
        if(enemy.getHealth() == 0) enemy.setDie(true);
        enemy.setHealth(enemy.getHealth()-this.getDamage());
        attackInformation(enemy,this.getDamage());
    }
}
