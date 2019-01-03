package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        Animal firstAnimal = new Animal("Roky",6,7,3, "Jr Canin","Running" );

        Adopter firstAdopter = new Adopter("Andrei",500);

        Food firstFood = new Food("Jr Canin",30.5,20,2020, true );

        RecreationActivity firstRecreation = new RecreationActivity("Running");

        Doctor firstDoctor = new Doctor("Dr.Marcu","dog specialization");

        Dog firstDog = new Dog("Rex",8,3,9,"Cane","Running",true,true);

        Game newGame = new Game();
        newGame.adopter = firstAdopter;
        newGame.doctor = firstDoctor;
        newGame.dog = firstDog;

    }
}
