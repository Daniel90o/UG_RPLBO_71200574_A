package org.example;

public class Creep extends Character implements AttackingHero{
    public Creep (String name, int health, int damage){
        super(name, health, damage);
    }
    public void attack(Hero hero){
        hero.health -= this.damage;
        if(hero.isDie()) {
            hero.health = 0;
        }
    }
}
