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
    System.out.println( name + " just gave some " + food.name + " to " + animal.name );

    }
    public void recreation(Animal animal, RecreationActivity activity) {
        System.out.println(name + " go out with " + animal.name + " to " + activity.name );
    }
}
