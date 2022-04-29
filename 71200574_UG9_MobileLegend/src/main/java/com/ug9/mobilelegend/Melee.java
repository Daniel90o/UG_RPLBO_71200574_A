package com.ug9.mobilelegend;

public class Melee extends Hero implements Skill {
    public Melee(String, name, int health, int damage) {
        super(name, health, damage);
    }
    @Override
    public void ultimate() {
        super.addDamage(100);
        System.out.println(this.getName() + " mengaktifkan ulti. Damage saat ini bertambah 100.");
    }
    @Override
    public void attack(Character enemy) {
        super.attack(enemy);
        if(enemy instanceof Creep) {
            setHealthBonus(200);
        }
