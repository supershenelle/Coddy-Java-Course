/*
Write a program that gets an integer input from the user, called limit. 
The program should print all even numbers from 0 up to (but not including) limit, each on a new line.
*/

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        // Write code here to print even numbers
        for (int i = 0; i < limit; i++)
        {
            if (i % 2 != 0)
                continue;
            
            System.out.println(i);
        }
    }
}
