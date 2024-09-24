import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        System.out.println("Welcome to arrayList practice");

        // Create an ArrayList of Strings.
        ArrayList<String> myListOfStrings = new ArrayList<>();

        // Add a few elements to the ArrayList.
        myListOfStrings.add("first");
        myListOfStrings.add("second");
        myListOfStrings.add("third");

        // Output the ArrayList.
        System.out.println("\n list of strings is: " + myListOfStrings);

        // Remove an element
        myListOfStrings.remove(0);

        // Output the ArrayList.
        System.out.println("\nAfter removing, my list of strings is: " + myListOfStrings);

        // Remove an element
        myListOfStrings.remove("second");

        // Output the ArrayList.
        System.out.println("\nnow my list of strings is: " + myListOfStrings);

        // Use a for loop to add some things to out list.
        String toAdd = "";
        for (int i = 0; i < 100; i++) {
            toAdd = toAdd + "a " + String.valueOf(i);
            myListOfStrings.add(toAdd);
//            myListOfStrings.add(String.valueOf(i+1));
        }

        System.out.println(myListOfStrings);

        // Use a for loop to output each element of our ArrayList.
        for (String stringItem : myListOfStrings) {
            System.out.println("An element in my list is: " + stringItem);
        }
    }
}