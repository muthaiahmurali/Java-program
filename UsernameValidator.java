package usernamevalidator;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a username: ");
        String username = scanner.nextLine();

        if (isValidUsername(username)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username. Username should have at least 4 characters and contain only letters, numbers, or underscores.");
        }

        scanner.close();
    }

    public static boolean isValidUsername(String username) {
        // Check if the username meets the criteria
        return username.matches("[a-zA-Z0-9_]{4,}");
    }
}
