package specialcharactercounter;

import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();

        int specialCharacterCount = 0;

        System.out.println("Special Characters:");

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // Checking if the character is a special character
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.println(ch);
                specialCharacterCount++;
            }
        }

        System.out.println("Number of Special Characters: " + specialCharacterCount);

        scanner.close();
    }
}
