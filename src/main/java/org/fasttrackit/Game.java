package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
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
        Food thirdFood = new Food();
        thirdFood.setName("Pedigree");
        Food noFood = new Food();
        noFood.setName("I don't want to feed the animal");
        availableFood.add(secondFood);
        availableFood.add(firstFood);
        availableFood.add(thirdFood);
        availableFood.add(noFood);
    }

    private void displayAvailableFood() {
        System.out.println(" Available food are :");
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood.get(i) != null) {
                System.out.println(+(i + 1) + "." + availableFood.get(i).getName());
            }
        }
    }

    private void initActivities() {
        RecreationActivity firsActivity = new RecreationActivity();
        firsActivity.setName("caught the ball");
        RecreationActivity secondActivity = new RecreationActivity();
        secondActivity.setName("to purr");
        RecreationActivity noActivity = new RecreationActivity();
        noActivity.setName("I don't want to play with the animal");
        availableActivities[0] = new RecreationActivity();
        availableActivities[0] = firsActivity;
        availableActivities[1] = new RecreationActivity();
        availableActivities[1] = secondActivity;
        availableActivities[2] = new RecreationActivity();
        availableActivities[2] = noActivity;
    }


    private void displayAvailableActivities() {
        System.out.println("Available activities:");
        for (int i = 0; i < availableActivities.length; i++) {
            if (availableActivities[i] != null) {
                String newLine = System.getProperty("line.separator");
                System.out.print(+(i+1) + "." + availableActivities[i].getName() + "" + newLine + "");
            }
        }
    }
    private int initAnimal() {
        String newLine = System.getProperty("line.separator");
        System.out.println("Available types of Animals are: 1.Cat" + newLine + "2.Dogs");
        System.out.println("Please insert the number of the type of the animal you want :");
        Scanner scanner = new Scanner(System.in);
        int name;
        try {
            name = scanner.nextInt();

            if (name == 1) {

                Animal cat = new Cat();
                int health = ThreadLocalRandom.current().nextInt(2, 10);
                cat.setHealth(health);
                int hungry = ThreadLocalRandom.current().nextInt(2, 10);
                cat.setHungry(hungry);
                int spirit = ThreadLocalRandom.current().nextInt(2, 10);
                cat.setSpirit(spirit);
                cat.setFavactivity("to purr");
                cat.setFavfood("Whiskas");
                System.out.println("Congratulation!You choose to adopt a Cat. ");
                animal = cat;
                return name;
            } else if (name == 2) {
                Animal dog = new Dog();
                int health = ThreadLocalRandom.current().nextInt(2, 10);
                dog.setHealth(health);
                int hungry = ThreadLocalRandom.current().nextInt(2, 10);
                dog.setHungry(hungry);
                int spirit = ThreadLocalRandom.current().nextInt(2, 10);
                dog.setSpirit(spirit);
                dog.setFavactivity("caught the ball");
                dog.setFavfood("Pedigree");
                animal = dog;
                System.out.println("Congratulation!You choose to adopt a Dog. ");
                return name;
            }
        } catch (InputMismatchException exception) {
            System.out.println("Please insert a number ");
            return initAnimal();

        }
        return initAnimal();
    }

    private String initAdopter() {

        System.out.println("Please insert your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        Adopter adopter = new Adopter();
        adopter.setName(name);

        System.out.println("I am  "+adopter.getName()+"");
        return name;
    }

    private String nameAnimal() {
        System.out.println("Please insert animal name: ");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        animal.setName(animalName);
        String newLine = System.getProperty("line.separator");
        System.out.println("Your animal name: " + animal.getName() + newLine + "-health level: " + animal.getHealth() + ", hungry level: "
                + animal.getHungry() + newLine + "-spirit level: " + animal.getSpirit() + newLine + "-Favorite activity: " + animal.getFavactivity() + newLine + "-Favorite food: "
                + animal.getFavfood());
        return animalName;
    }

    private int requireFeeding() {
        displayAvailableFood();
        System.out.println("Please select a food:");
        Scanner scanner = new Scanner(System.in);
        int selectFood = scanner.nextInt();
        for (int i = 0; i < availableFood.size(); i++) {
           String selectFoodString = availableFood.get(selectFood - 1).getName();
            System.out.println("Selected Food :" + selectFoodString + "");

            if (selectFoodString.equals(animal.getFavfood())) {
                animal.hungry = animal.hungry + 2;
                animal.health = animal.health - 1;
                System.out.println("You choose to feed the animal with his favorite Food");
                break;

            } else if ( selectFoodString.equals("I don't want to feed the animal")){
                animal.health = animal.health - 1;
                animal.hungry = animal.hungry - 1;
                System.out.println("You choose to not feed the animal");
                break;
            } else
                animal.hungry = animal.hungry + 1;
                animal.health = animal.health - 1;
                System.out.println("You choose to feed the animal with normal food");
                break;
        }
        String newLine = System.getProperty("line.separator");
        System.out.println("Your animal name: " + animal.getName() + newLine + "-health level: " + animal.getHealth() + ", hungry level: "
                + animal.getHungry() + newLine + "-spirit level: " + animal.getSpirit() + newLine + "-Favorite activity: " + animal.getFavactivity() + newLine + "-Favorite food: "
                + animal.getFavfood());
        return selectFood;
    }
        private int requireActivity () {
            displayAvailableActivities();
            System.out.println("Please select an activity:");
            Scanner scanner = new Scanner(System.in);
            int selectActivity = scanner.nextInt();
            for (int i = 0; i < availableActivities.length; i++) {
                String selectActivityString =availableActivities[selectActivity-1].getName();
                System.out.println("Selected Activity :" + selectActivityString + "");

                if (selectActivityString.equals(animal.getFavactivity())) {
                    animal.health = animal.health + 2;
                    animal.hungry = animal.hungry - 1;
                    System.out.println("You choose to play with the animal his favorite activity");
                    break;

                } else if ( selectActivityString.equals("I don't want to play with the animal")){
                    animal.health = animal.health - 1;
                    animal.hungry = animal.hungry - 1;
                    System.out.println("You choose to not play with the animal");
                    break;
                } else
                    animal.health = animal.health + 1;
                animal.hungry = animal.hungry - 2;
                System.out.println("You choose to play with the animal a normal activity");
                break;
            }
            String newLine = System.getProperty("line.separator");
            System.out.println("Your animal name: " + animal.getName() + newLine + "-health level: " + animal.getHealth() + ", hungry level: "
                    + animal.getHungry() + newLine + "-spirit level: " + animal.getSpirit() + newLine + "-Favorite activity: " + animal.getFavactivity() + newLine + "-Favorite food: "
                    + animal.getFavfood());
            return selectActivity;
        }

    public void start() {
        initActivities();
        initFood();
        initAnimal();
        initAdopter();
        nameAnimal();
        for (int i = 0; i < 10; i++) {
            requireFeeding();
            requireActivity();
        }
        String newLine = System.getProperty("line.separator");
        System.out.println("Your animal name: " + animal.getName() + newLine + "-health level: " + animal.getHealth() + ", hungry level: "
                + animal.getHungry() + newLine + "-spirit level: " + animal.getSpirit() + newLine + "-Favorite activity: " + animal.getFavactivity() + newLine + "-Favorite food: "
                + animal.getFavfood());
        if (animal.getHealth()<=1 || animal.getHungry()<=1 ){
            System.out.println("You lose the game");
        }else
            System.out.println("You Win the game");


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
