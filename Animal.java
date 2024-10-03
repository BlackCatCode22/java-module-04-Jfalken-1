package jacob.zoo.com;

import java.time.LocalDate;

public class Animal {

    // All attributes (fields)
    private String animalName;
    private int age;
    private String seasonBorn;
    private String sex;
    private String weight;
    private String color;
    private String animalID;
    private LocalDate animalBirthdate;
    private String origen;
    private LocalDate arrivalDate;
    private static int numOfAnimals;

    // Create a constructor that accepts all fields as arguments



    public Animal(String sex, int age, String weight, String animalName, String animalID,
                  LocalDate animalBirthdate, String color, String origen) {
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.animalName = animalName;
        this.animalID = animalID;
        this.animalBirthdate = animalBirthdate;
        this.color = color;
        this.origen = origen;
    }






    // Getters
    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getAnimalID() {
        return animalID;
    }

    public String getWeight() {
        return weight;
    }

    public String getAnimalName() {
        return animalName;
    }

    public LocalDate getAnimalBirthdate() {
        return animalBirthdate;
    }

    public String getColor() {
        return color;
    }

    public String getOrigen() {
        return origen;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public String getSeasonBorn() {
        return seasonBorn;
    }

    public static int getNumOfAnimals() {
        return numOfAnimals;
    }

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setAnimalID(String animalID) {
        this.animalID = animalID;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public void setAnimalBirthdate(LocalDate animalBirthdate) {
        this.animalBirthdate = animalBirthdate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setSeasonBorn(String seasonBorn) {
        this.seasonBorn = seasonBorn;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
