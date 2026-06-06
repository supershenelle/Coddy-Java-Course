/*
Create a method named merge that receives two arrays as arguments. The method merges the two arrays into one sorted array and returns it.
Important: The final merged array must be sorted in ascending order.
*/

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static String[] merge(String[] arr1, String[] arr2) {
        // Write code here
        String[] res = new String[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, res, 0, arr1.length);
        System.arraycopy(arr2, 0, res, arr1.length, arr2.length);
        Arrays.sort(res);
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArr1 = scanner.nextLine();
        String textArr2 = scanner.nextLine();
        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    }
}
