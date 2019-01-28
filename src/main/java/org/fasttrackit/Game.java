package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

public class Game {
   private Adopter adopter;
   private Dog dog;
   private Doctor doctor;
    private RecreationActivity[] availableActivities = new RecreationActivity[10];
   private List<Food> avilableFood = new ArrayList<>();

    private void initFood(int foodCount) {
        for (int i = 0; i < foodCount; i++) {
        Food food = new Food();
        }

    }
    public void displayAvailableFood() {
        System.out.println(" Available food are :");
        for (int i = 0; i < avilableFood.size(); i++) {
            if (avilableFood.get(i) != null)
                System.out.println(avilableFood.get(i).getName());

        }
    }
    private void initActivities(int index, RecreationActivity recreationActivity) {
        availableActivities[index] = recreationActivity;
    }


    public void displayAvailableActivities() {
        System.out.println("Available activities");
        for (RecreationActivity recreationActivity : availableActivities) {
            if (recreationActivity != null) {
                System.out.println(recreationActivity.getName());
            }
        }
    }
    public void start() {
        initFood(2);
        Food firstFood = new Food();
        firstFood.setName("Canino ECO");
        avilableFood.add(firstFood);
        Food secondFood = new Food();
        secondFood.setName("Whiskas");
        avilableFood.add(secondFood);



        RecreationActivity firstActivity = new RecreationActivity();
         firstActivity.setName("Running");

         initActivities(0, firstActivity);

        RecreationActivity secondActivity = new RecreationActivity();
        secondActivity.setName("to purr");

        initActivities(1, secondActivity);
        displayAvailableActivities();
        displayAvailableFood();
    }
        public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
