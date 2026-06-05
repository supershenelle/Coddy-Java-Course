/*
Implement methods for event schedule
*/

public class Main {
    // Write your methods here
    public static void printHeader() {
        System.out.println("=================");
        System.out.println("Event Schedule");
        System.out.println("=================");
    }

    public static void printEvent() {
        System.out.println(">> Main Event <<");
        System.out.println("Time: 7:00 PM");
        System.out.println("Location: Hall A");
    }

    public static void printFooter() {
        System.out.println("=================");
        System.out.println("Thank You!");
        System.out.println("=================");
    }
    
    public static void main(String[] args) {
        // Call the methods in correct order
        printHeader();
        for (int i = 0; i < 3; i++)
            printEvent();
        printFooter();
    }
}
