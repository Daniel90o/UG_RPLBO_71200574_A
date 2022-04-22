package org.example;

public class LoneDruid extends Hero implements Upgradeable, Summoner {
    private int killCreep;
    private int level;

    public LoneDruid(){
        super("Lone Druid",1800,140);
    }

    public SpiritBear summon() {
        return new SpiritBear(this);
    }

    public void upgrade() {
        if(this.killCreep>=3){
            this.level += 1;
            this.killCreep -= 3;
            this.name = "Lone Druid +"+this.level;
            this.damage += 20;
        }
    }

    public void showCharacterInfo() {
        super.showCharacterInfo();
        System.out.println("Kill Creep : "+this.killCreep);
    }

    public void attack(Creep creep) {
        creep.health -= this.damage;
        if(creep.isDie()){
            this.killCreep += 1;
            creep.health = 0;
        }
    }
}
