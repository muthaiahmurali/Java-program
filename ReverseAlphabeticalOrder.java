import java.util.Arrays;
import java.util.Scanner;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        // Arrange letters of the word alphabetically in reverse order
        String reversedAlphabeticalWord = reverseAlphabeticalOrder(word);

        // Display the word with letters arranged alphabetically in reverse order
        System.out.println("Word with letters arranged alphabetically in reverse order: " + reversedAlphabeticalWord);

        sc.close();
    }

    public static String reverseAlphabeticalOrder(String word) {
        // Convert the word to a character array
        char[] charArray = word.toCharArray();

        // Sort the character array in reverse order
        Arrays.sort(charArray);

        // Create a StringBuilder to construct the result
        StringBuilder resultBuilder = new StringBuilder();

        // Append characters from the sorted array in reverse order
        for (int i = charArray.length - 1; i >= 0; i--) {
            resultBuilder.append(charArray[i]);
        }

        // Convert StringBuilder to String and return
        return resultBuilder.toString();
    }
}