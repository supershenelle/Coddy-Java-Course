// BASIC CALCULATOR APP

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculator App");

        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println("First number: " + first);
        System.out.println("Second number: " + second);

        double sum = first + second;
        double difference = first - second;

        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", first*second);
        System.out.printf("Quotient: %.2f\n", first/second);
    }
}
