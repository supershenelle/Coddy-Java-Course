/*
Create a method named calculateStats that takes an array of integers as input and performs the following operations:
Calculates the sum of all elements in the array.
Calculates the average of the elements in the array.
Finds the maximum element in the array.
Finds the minimum element in the array.
The method should return an array of doubles containing the sum, average, maximum, and minimum, in that order.
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static double[] calculateStats(int[] arr) {
        // Write your code here
        double sum = 0;
        int count = 0;
        ArrayList<Double> results = new ArrayList<>();

        for (int number : arr)
        {
            sum += number;
            count++;
        } results.add(sum);

        double average = sum / count;
        results.add(average);

        double max = arr[0];
        for (int number : arr)
        {
            if (number > max)
                max = number;
        } results.add(max);

        double min = arr[0];
        for (int number : arr)
        {
            if (number < min)
                min = number;
        } results.add(min);

        double[] result  = new double[results.size()];
        for (int i = 0; i < results.size(); i++)
        {
            result[i] = results.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
           numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
    }
}
