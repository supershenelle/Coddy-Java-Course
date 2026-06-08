/*
Create a program that starts with an array of words, and prints a new array containing only the words longer than 5 characters
*/

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        // Write your code below
        ArrayList<String> arrs = new ArrayList<>();
        for (int i = 0; i<arr.length; i++)
        {
            if (arr[i].length() > 5)
                arrs.add(arr[i]);
        }

        String[] res = arrs.toArray(new String[0]);
        System.out.println(Arrays.toString(res));
    }
}
