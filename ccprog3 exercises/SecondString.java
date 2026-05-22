import java.util.Scanner;

public class SecondString {
    void main ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("LASTNAME, FIRSTNAME ----------");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        int length = name.length();
        String firstName = name.substring(name.indexOf(',')+2, length);
        String lastName = name.substring(0, name.indexOf(','));
        String name2 = firstName + " " + lastName;

        System.out.println();

        System.out.println("FIRSTNAME LASTNAME ----------");
        System.out.print("Name: " + name2);
    }
}
