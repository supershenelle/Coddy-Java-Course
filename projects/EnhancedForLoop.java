/*
Use enhanced for loop in each iteration, prints the current fruit in uppercase
*/

public class Main {
    public static void main(String[] args) {
        // Initialize the fruits array
        String[] fruits = {"apple", "banana", "orange", "grape", "kiwi"};

        // Use an enhanced for loop to iterate over the array
        for (String fruit : fruits)
        {
            System.out.println(fruit.toUpperCase());
        }
    }
}
