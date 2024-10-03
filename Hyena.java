package jacob.zoo.com;

import java.time.LocalDate;

public class Hyena extends Animal {

    private static int numOfHyenas;

    public Hyena(String sex, int age, String weight, String animalName, String animalID, LocalDate animalBirthdate, String color, String origen) {
        super(sex, age, weight, animalName, animalID, animalBirthdate, color, origen);
    }


    // jacob.zoo.com.Hyena constructor
//    public Hyena(String name) {
//        super(name);
//        numOfHyenas++;
//    }

    public static int getNumOfHyenas() {
        return numOfHyenas;
    }
}
