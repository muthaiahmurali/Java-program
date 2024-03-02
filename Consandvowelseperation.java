import java.util.Scanner;

public class Consandvowelseperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a word
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();

        // Separate consonants and vowels
        String consonants = separateConsonants(word);
        String vowels = separateVowels(word);

        // Output the result
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }

    // Function to separate consonants in a given word
    private static String separateConsonants(String word) {
        StringBuilder result = new StringBuilder();

        for (char c : word.toLowerCase().toCharArray()) {
            if (!isVowel(c) && Character.isLetter(c)) {
                result.append(c).append(" ");
            }
        }

        return result.toString().trim();
    }

    // Function to separate vowels in a given word
    private static String separateVowels(String word) {
        StringBuilder result = new StringBuilder();

        for (char c : word.toLowerCase().toCharArray()) {
            if (isVowel(c)) {
                result.append(c).append(" ");
            }
        }

        return result.toString().trim();
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
