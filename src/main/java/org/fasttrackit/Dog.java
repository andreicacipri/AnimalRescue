package org.fasttrackit;

public class Dog extends Pet {
   private boolean bark;
//    public Dog(String name, int health, int hungry, int spirit, String favfood, String favactivity, Boolean inHouse, boolean bark) {
//        super(name, health, hungry, spirit, favfood, favactivity, inHouse);
//        this.bark = bark;
//    }

    public boolean isBark() {
        return bark;
    }

    public void setBark(boolean bark) {
        this.bark = bark;
    }
}
