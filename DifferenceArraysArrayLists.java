import java.util.ArrayList;
import java.util.Arrays;

/**
 * Difference between Arrays and ArrayLists in Java
 */

public class DifferenceArraysArrayLists {
    public static void main(String[] args) {

        // Array demonstration
        // Since arrays have a fixed size, we need to specify the size at the time of
        // declaration
        String[] foodArray = new String[4];
        foodArray[0] = "Pizza";
        foodArray[1] = "Burger";
        foodArray[2] = "Pasta";
        foodArray[3] = "Salad";

        // To add a 5th item, we would get an Array Index Out of Bounds Exception
        // foodArray[4] = "Sushi"; // This will throw an exception
        // We also use .length to get the size of the array
        System.out.println("--- Array Demonstration ---");
        System.out.println("Array size: " + foodArray.length);
        System.out.println(" First food item: " + foodArray[0]);

        // ArrayList demonstration
        // ArrayLists are dynamic and can grow in size as needed (no need to specify
        // size at declaration)
        ArrayList<String> foodList = new ArrayList<>();

        // Adding items to the ArrayList can be done using the add() method instead of
        // index assignment
        foodList.add("Pizza");
        foodList.add("Burger");
        foodList.add("Pasta");
        foodList.add("Salad");
        foodList.add("Sushi"); // This is perfectly fine and does not throw an exception

        // We can also use the size() method to get the number of elements in the
        // ArrayList and get() method to access elements by index
        System.out.println("\n--- ArrayList Demonstration ---");
        System.out.println("ArrayList size: " + foodList.size());
        System.out.println("Last food item: " + foodList.get(4)); // Accessing the 5th item (index 4)

        // In an array, you cant remove an element. You can only null it out but the
        // size of the array remains the same.
        foodArray[2] = null; // This will set the 3rd item to null, but the array size remains 4
        System.out.println("\nAfter nulling out the 3rd item in the array:");
        System.out.println("Array size: " + foodArray.length); // Still 4
        System.out.println("3rd item in array: " + foodArray[2]); // This will print null

        // In an ArrayList, you can remove an element and the size will decrease
        // accordingly.
        foodList.remove(2); // This will remove the 3rd item (Pasta) and shift the remaining items
        System.out.println("\nArrayList size after removal: " + foodList.size()); // Now 4

        // Printing the collection
        System.out.println("Array contents (needs helper): " + Arrays.toString(foodArray)); // Using Arrays.toString to
                                                                                            // print the array
        System.out.println("ArrayList contents (built-in): " + foodList); // ArrayList has a built-in toString method
                                                                          // that prints the contents in a readable
                                                                          // format
    }
}
