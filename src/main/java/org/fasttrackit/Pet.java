package org.fasttrackit;

public class Pet extends Animal {
Boolean inHouse;

    public Pet(String name, int health, int hungry, int spirit, String favfood, String favactivity, Boolean inHouse) {
        super(name, health, hungry, spirit, favfood, favactivity);
        this.inHouse = inHouse;
    }
}
