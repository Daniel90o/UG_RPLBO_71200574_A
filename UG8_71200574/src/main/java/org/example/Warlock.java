package org.example;

public class Warlock extends Hero implements Summoner{
    private int numOfSummon = 0;

    public Warlock(){
        super("Warlock",700,80);
    }

    public void attack(Creep creep) {
        creep.health -= this.damage;
        if(creep.isDie()) {
            creep.health = 0;
        }
    }

    public Golem summon() {
        this.numOfSummon += 1;
        return new Golem(this);
    }
}
