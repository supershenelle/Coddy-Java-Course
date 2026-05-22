import java.util.Scanner;

public class FirstString {
    void main ()
    {
        System.out.print("Input string: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int length = string.length();
        char first = string.charAt(0);
        char last = string.charAt(length - 1);

        System.out.println("First and last letters: " + first + " , " + last);
    }
}
