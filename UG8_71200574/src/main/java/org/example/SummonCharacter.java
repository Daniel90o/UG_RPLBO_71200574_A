package org.example;

public class SummonCharacter extends Hero {
    protected Summoner owner;

    public SummonCharacter(String name, int health, int damage, Summoner summoner){
        super(name, health, damage);
        this.owner = summoner;
    }
}
