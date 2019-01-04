package org.fasttrackit;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Animal firstAnimal = new Animal();
        firstAnimal.setName("Roky");
        firstAnimal.setSpirit(5);
        firstAnimal.setHungry(7);
        firstAnimal.setHealth(9);
        firstAnimal.setFavactivity("Running");

        Adopter firstAdopter = new Adopter();
        firstAdopter.setMoney(500);
        firstAdopter.setName("Andrei");

        Food firstFood = new Food();
        firstFood.setName("Canino Pedigree");
        firstFood.setPrice(300);
        firstFood.setQuantity(40);
        firstFood.setYear(LocalDate.of(2020, 11, 20));
        firstFood.setInStock(true);

        System.out.println(firstFood.getYear());

        RecreationActivity firstRecreation = new RecreationActivity();
        firstRecreation.setName("catch the ball");

        Doctor firstDoctor = new Doctor();
        firstDoctor.setName("Dr.Marcu");
        firstDoctor.setSpecialization("dog specialization");

        System.out.println(firstDoctor.getName());
        System.out.println(firstDoctor.getSpecialization());

        Dog firstDog = new Dog();
        firstDog.setName("Rex");
        firstDog.setHealth(5);
        firstDog.setHungry(9);
        firstDog.setSpirit(3);
        firstDog.setFavactivity("Sleep");
        firstDog.setFavfood("Canino");
        firstDog.setInHouse(true);
        firstDog.setBark(true);

        Game newGame = new Game();
        newGame.setAdopter(firstAdopter);
        newGame.setDoctor(firstDoctor);
        newGame.setDog(firstDog);

        firstAdopter.feeding(firstAnimal, firstFood);
        firstAdopter.recreation(firstAnimal,firstRecreation);
    }
    }
