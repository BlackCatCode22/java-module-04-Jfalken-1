package jacob.zoo.com;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;


public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to my zoo program");

        // This is all the date stuff we did last week.
        String animalLine = "4 year old female hyena, born in spring, tan color, 70 pounds, from Friguia Park, Tunisia";

        int age = AnimalParser.findAge(animalLine);
        String sex = AnimalParser.findSex(animalLine);
        String weight = AnimalParser.findWeight(animalLine);
        String name = "Jeff";
        String animalID = "hy01";
        LocalDate birthday = LocalDate.of(2020,10,3);
        String color = AnimalParser.findColor(animalLine);
        String origen = AnimalParser.findOrigen(animalLine);

        Animal myNewAnimal = new Animal(sex, age, weight, name, animalID, birthday, color, origen);

        System.out.println("\n this is the new animal!\n");
        System.out.println("ID: " + myNewAnimal.getAnimalID() + "\n" + "Name: " + myNewAnimal.getAnimalName() + "\nBirth date: " + myNewAnimal.getAnimalBirthdate());



















    }
}