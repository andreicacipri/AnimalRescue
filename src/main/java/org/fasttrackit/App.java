package org.fasttrackit;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Animal firstAnimal = new Animal();
        firstAnimal.name = "Caine";
        firstAnimal.health = 9;
        firstAnimal.favactivity = "alergare";

        Adopter firstAdopter = new Adopter();
        firstAdopter.name = "Andrei";
        firstAdopter.money = 500;

        Food firstFood = new Food();
        firstFood.name = "Oase";
        firstFood.price = 15;
        firstFood.quantity = 4;
        firstFood.year = LocalDateTime.now();

        RecreationActivity firstRecreation = new RecreationActivity();
        firstRecreation.name = "Alergare";

        Doctor firstDoctor = new Doctor();
        firstDoctor.name = "Dr.Marcu";
        firstDoctor.specialization = "veterinar";

        Pet firstPet = new Pet();
        firstPet.inHouse = true;

        Dog firstDog = new Dog();
        firstDog.bark = true;

        Game newGame = new Game();
        newGame.adopter = firstAdopter;
        newGame.doctor = firstDoctor;
        newGame.dog = firstDog;

    }
}
