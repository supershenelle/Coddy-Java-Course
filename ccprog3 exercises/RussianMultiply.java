import java.util.Scanner;

public class RussianMultiply {
    public int multiply (int a, int b)
    {
        int sum = 0;
        while (b != 0) {
            if (b % 2 != 0){
                sum += a;
            }

            a = a * 2;
            b = b / 2;
        }
        return sum;
    }

    void main ()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = scanner.nextInt();
        while (num1 < 0) {
            System.out.print("Please enter FIRST non-negative number: ");
            num1 = scanner.nextInt();
        }

        System.out.print("Enter next number: ");
        int num2 = scanner.nextInt();
        while (num2 < 0) {
            System.out.print("Please enter SECOND non-negative number: ");
            num2 = scanner.nextInt();
        }

        int output = multiply(num1, num2);
        System.out.println("Output: " + output);
    }
}
