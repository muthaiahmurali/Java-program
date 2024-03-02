import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a statement
        System.out.println("Enter a statement: ");
        String statement = scanner.nextLine();

        // Count vowels
        int vowelCount = countVowels(statement);

        // Output the result
        System.out.println("Number of vowels = " + vowelCount);
    }

    // Function to count vowels in a given statement
    private static int countVowels(String statement) {
        int count = 0;
        char[] charArray = statement.toLowerCase().toCharArray();

        for (char c : charArray) {
            if (isVowel(c)) {
                count++;
            }
        }

        return count;
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
