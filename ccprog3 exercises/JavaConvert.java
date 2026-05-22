import java.util.Scanner;

// CHECK IF PALINDROME NUMBER
public class JavaConvert {
    void main()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        String reverseInt = Integer.toString(number);
        StringBuilder reverseString = new StringBuilder(reverseInt).reverse();
        int reverseNumber = Integer.parseInt(reverseString.toString());

        if (number ==  reverseNumber)
            System.out.println("THIS IS A PALINDROME!");

        else
            System.out.println("THIS IS NOT A PALINDROME!");
    }
}
