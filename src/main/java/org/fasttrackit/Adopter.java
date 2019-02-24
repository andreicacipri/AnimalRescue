package org.fasttrackit;

public class Adopter {
   private String name;


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
public void feeding (Animal animal,Food food) {
    System.out.println("Level of hungy is " + animal.hungry);
    System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName());
    animal.hungry = animal.hungry - 1;
    System.out.println("New hungry level is: " + animal.hungry);
    if (food.getName() == animal.favfood)
        animal.spirit = animal.spirit+1;
    System.out.println("New level of happines  is: " + animal.spirit);

}

    public void recreation(Animal animal, RecreationActivity activity) {
        System.out.println("Level of happines is " +animal.getSpirit());
        System.out.println(getName() + " go out with " + animal.getName() + " to " + activity.getName());
        if (activity.getName() == animal.favactivity)
            animal.spirit = animal.spirit +2;
        else
            animal.spirit = animal.spirit +1;
        System.out.println("New level of happines  is: " +animal.spirit );
    }
}
