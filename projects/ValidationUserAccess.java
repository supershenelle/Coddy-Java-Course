/*
Write a method named is_valid that gets two strings arguments, username and password.
The method will return true if the username and password are valid in the system, otherwise false.
Our system contains only two valid usernames - "admin" and "user".
The valid password for username "user" is "qweasd".
For username "admin" any password is valid!
*/

import java.util.Scanner;

public class Main {
    public static boolean is_valid(String username, String password) {
        // Write your code below
        if (username.equals("admin"))
            return true;

        else if (username.equals("user") && password.equals("qweasd"))
            return true;

        else
            return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        String pass = scanner.nextLine();
        boolean res = is_valid(user, pass);
        System.out.println(res);
    }
}
