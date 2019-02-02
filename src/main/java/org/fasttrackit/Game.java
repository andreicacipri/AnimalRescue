package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {
   private Adopter adopter;
   private Animal animal;
   private Doctor doctor;
    private RecreationActivity[] availableActivities = new RecreationActivity[10];
   private List<Food> availableFood = new ArrayList<>();

    private void initFood() {
        Food firstFood = new Food();
        firstFood.setName("Canino ECO");
        Food secondFood = new Food();
        secondFood.setName("Whiskas");
        availableFood.add(secondFood);
        availableFood.add(firstFood);
        }

    private void displayAvailableFood() {
        System.out.println(" Available food are :");
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood.get(i) != null) {
                System.out.println(availableFood.get(i).getName());
            }
        }
    }
    private void initActivities() {
        RecreationActivity firsActivity = new RecreationActivity();
        firsActivity.setName("Running");
        RecreationActivity secondActivity = new RecreationActivity();
        secondActivity.setName("to purr");
        availableActivities[0] = new RecreationActivity();
        availableActivities[0] = firsActivity;
        availableActivities[1] = new RecreationActivity();
        availableActivities[1] = secondActivity;
    }


    private void displayAvailableActivities() {
        System.out.println("Available activities:");
        for (RecreationActivity recreationActivity : availableActivities) {
            if (recreationActivity != null) {
                System.out.println(recreationActivity.getName());
            }
        }
    }
    private String initAnimal() {
        System.out.println("Available types of Animals are: Cats and Dogs");
        System.out.println("Please select the type of Animal you want :");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (name.equals("Cat")){

            Animal cat = new Cat();
            int health = ThreadLocalRandom.current().nextInt(1, 10);
            cat.setHealth(health);
            int hungry = ThreadLocalRandom.current().nextInt(1, 10);
            cat.setHungry(hungry);
            int spirit = ThreadLocalRandom.current().nextInt(1, 10);
            cat.setSpirit(spirit);
            cat.setFavactivity("to purr");
            cat.setFavfood("Wyskas");
            System.out.println("You choose to adopt a : " + name);
            animal = cat;
            return name;
        }
        else if (name.equals("Dog")) {
            Animal dog = new Dog();
            int health = ThreadLocalRandom.current().nextInt(1, 10);
            dog.setHealth(health);
            int hungry = ThreadLocalRandom.current().nextInt(1, 10);
            dog.setHungry(hungry);
            int spirit = ThreadLocalRandom.current().nextInt(1, 10);
            dog.setSpirit(spirit);
            dog.setFavactivity("caught the ball");
            dog.setFavfood("Pedigree ECO");
            animal = dog;
            System.out.println("You choose to adopt a : " + name);
            return name;
        }
            System.out.println("Please try again ");
            return initAnimal();


    }
    private String initAdopter() {

        System.out.println("Please insert your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Adopter adopter = new Adopter();
        adopter.setName(name);
        System.out.println("Please insert your money: ");
        Scanner scanner1 = new Scanner(System.in);
        double money = scanner1.nextDouble();
        adopter.setMoney(money);

        System.out.println("I am  " + adopter.getName()+" and I have "+ adopter.getMoney()+" Dollars");
    return name;
    }

    private String nameAnimal() {
        System.out.println("Please insert animal name: ");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        animal.setName(animalName);
        System.out.println("Your animal name: "+animal.getName()+", health level: "+animal.getHealth()+ ", hungry level: "
                +animal.getHungry()+ ", spirit level: "+animal.getSpirit()+", Favorite activity: "+animal.getFavactivity()+ ", and Favorite food: "
                +animal.getFavfood());
        return animalName;
    }
    private String requireFeeding() {
        displayAvailableFood();
        System.out.println("Please select a food:");
        Scanner scanner = new Scanner(System.in);
        String selectFood = scanner.nextLine();
        if (selectFood.equals(animal.getFavfood())) {
            animal.hungry = animal.hungry + 2;
            animal.health = animal.health-1;
        }
        animal.hungry = animal.hungry + 1;
        animal.health = animal.health-1;
        if (animal.hungry >= 10) {
            animal.setHungry(10);
            animal.spirit = animal.spirit - 2;
            if (animal.spirit >= 10) {
                animal.setSpirit(10);
                animal.spirit = animal.spirit - 2;

            }
        }
        System.out.println("Your animal name: "+animal.getName()+", health level: "+animal.getHealth()+ ", hungry level: "
                +animal.getHungry()+ ", spirit level: "+animal.getSpirit()+", Favorite activity: "+animal.getFavactivity()+ ", and Favorite food: "
                +animal.getFavfood());
    return selectFood;
    }
    private String requireActivity() {
        displayAvailableActivities();
        System.out.println("Please select an activity:");
        Scanner scanner = new Scanner(System.in);
        String selectActivity = scanner.nextLine();
        if (selectActivity.equals(animal.getFavactivity())) {
            animal.health = animal.health+ 2;
            animal.hungry = animal.hungry -3;
        }
        animal.health = animal.health + 1;
        animal.hungry = animal.hungry -2;
        if (animal.health >= 10) {
            animal.setHealth(10);
            animal.spirit = animal.spirit - 2;
            if (animal.spirit >= 10) {
                animal.setSpirit(10);
                animal.spirit = animal.spirit - 2;
            }
        }
        System.out.println("Your animal name: "+animal.getName()+", health level: "+animal.getHealth()+ ", hungry level: "
                +animal.getHungry()+ ", spirit level: "+animal.getSpirit()+", Favorite activity: "+animal.getFavactivity()+ ", and Favorite food: "
                +animal.getFavfood());
        return selectActivity;
    }
    public void start() {
        initAnimal();
        initAdopter();
        nameAnimal();

        requireFeeding();
        requireActivity();

    }
        public Adopter getAdopter() {
        return adopter;
    }

    public void setAdopter(Adopter adopter) {
        this.adopter = adopter;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setDog(Animal animal) {
        this.animal = animal;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
