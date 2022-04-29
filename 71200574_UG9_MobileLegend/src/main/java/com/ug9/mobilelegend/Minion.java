package com.ug9.mobilelegend;

public class Minion extends NPC {
    public Minion(String name, int health, int damage) {
        super(name, health, damage);

    }
    @Override
    public void attack(Character enemy){
        System.out.println("Tidak bisa menyerang");
    }else{
        super.attack(enemy);
    }
}
