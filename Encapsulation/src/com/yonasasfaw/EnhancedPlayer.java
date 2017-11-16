package com.yonasasfaw;

public class EnhancedPlayer {
    private String name;
    private int hitPoints;
    private String weapon;

    public EnhancedPlayer(String name, int health, String Weapon){
        this.name = name;

        if(health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if(this.hitPoints <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int getHealth(){
        return hitPoints;
    }

}
