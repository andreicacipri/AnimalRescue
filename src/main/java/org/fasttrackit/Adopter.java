package org.fasttrackit;

public class Adopter {
   private String name;
   private double money;

//    public Adopter(String name, double money) {
//        this.name = name;
//        this.money = money;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
public void feeding (Animal animal,Food food){
    System.out.println("Level of hungy is " +animal.hungry);
        System.out.println( getName() + " just gave some " + food.getName() + " to " + animal.getName());
      animal.hungry = animal.hungry - 1;
    System.out.println("New hungry level is: " +animal.hungry );


    }
    public void recreation(Animal animal, RecreationActivity activity) {
        System.out.println("Level of happines is " +animal.getSpirit());
        System.out.println(getName() + " go out with " + animal.getName() + " to " + activity.getName());
        animal.spirit = animal.spirit +1;
        System.out.println("New level of happines  is: " +animal.spirit );
    }
}
