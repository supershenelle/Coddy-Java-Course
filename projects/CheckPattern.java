import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrString1 = scanner.nextLine();
        String arrString2 = scanner.nextLine();
        String[] str1 = arrString1.split(",");
        String[] str2 = arrString2.split(",");

        System.out.println(containsPattern(str1, str2));
    }

    public static boolean containsPattern(String[] source, String[] pattern) {
        if (pattern.length == 0) return true;
        if (pattern.length > source.length) return false;

        int searchLimit = source.length - pattern.length;

        for (int i = 0; i <= searchLimit; i++) {
            if (source[i].equals(pattern[0])) {
                boolean matched = true;

                for (int j = 1; j < pattern.length; j++) {
                    if (!source[i + j].equals(pattern[j])) {
                        matched = false;
                        break;
                    }
                }

                if (matched) return true;
            }
        }

        return false;
    }
}
