package com.ug9.mobilelegend;

public class Creep extends NPC {
    public Creep(String name, int health, int damage) {
        super(name, health, damage);
    }
    @Override
    public void attack(Character enemy) {
        if(enemy instanceof creep || enemy instanceof Minion){
            System.out.println("Tidak bosa menyerang");
        }else{
            super.attack(enemy);
        }
    }
}
