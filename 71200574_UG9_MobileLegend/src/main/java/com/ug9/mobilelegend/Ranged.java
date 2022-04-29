package com.ug9.mobilelegend;

public class Ranged extends Hero implements Skill {
    public Ranged(String name, int health, int damage){
        super((name, health, damage));
    }
    @Override
    public void ultimate() {
        super.addDamage(150);
        System.out.println(this.getName() + " mengaktifkan ulti. Damage saat ini bertambah 150.");
    }
    @Override
    public void attack(Character enemy) {
        super.attack(enemy);
        if(enemy instanceof Minion){
            setHealthBonus(150);
        }
}
