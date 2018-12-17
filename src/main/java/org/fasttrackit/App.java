package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Animal FirstAnimal = new Animal();
        FirstAnimal.name = "Caine";
        FirstAnimal.health = 9;
        FirstAnimal.favactivity = "alergare";
        Adopter FirstAdopter = new Adopter();
        FirstAdopter.name = "Andrei";
        FirstAdopter.money = 500;
        Food FirstFood = new Food();
        FirstFood.name = "Oase";
        FirstFood.price = 15;
        FirstFood.quantity = 4;
        RecreationActivity FirstRecreation = new RecreationActivity();
        FirstRecreation.name = "Alergare";
        Doctor FirstDoctor = new Doctor();
        FirstDoctor.name = "Dr.Marcu";
        FirstDoctor.specialization = "veterinar";
        Game newGame = new Game();

    }
}
