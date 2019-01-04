package org.fasttrackit;

public class Animal {
   protected String name;
   protected int health;
   protected int hungry;
   protected int spirit;
   protected String favfood;
   protected String favactivity;

//    public Animal(String name, int health, int hungry, int spirit, String favfood, String favactivity) {
//        this.name = name;
//        this.health = health;
//        this.hungry = hungry;
//        this.spirit = spirit;
//        this.favfood = favfood;
//        this.favactivity = favactivity;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public int getSpirit() {
        return spirit;
    }

    public void setSpirit(int spirit) {
        this.spirit = spirit;
    }

    public String getFavfood() {
        return favfood;
    }

    public void setFavfood(String favfood) {
        this.favfood = favfood;
    }

    public String getFavactivity() {
        return favactivity;
    }

    public void setFavactivity(String favactivity) {
        this.favactivity = favactivity;
    }
}
