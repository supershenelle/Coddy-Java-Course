/*
The method should print the message to the console n times. Use a for loop to repeat the printing.
In the main method, call printNTimes with the inputs message and the input n
*/

import java.util.Scanner;

public class Main {
    public static void printNTimes(String message, int n) {
        // Write you code here
        for (int i = 0; i < n; i++)
        {
            System.out.println(message);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        int n = scanner.nextInt();

        printNTimes(msg, n);
    }
}
