import java.util.Scanner;

public class CharaterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Input the character to be searched
        System.out.print("Enter the character to be searched: ");
        char searchChar = scanner.next().charAt(0);

        // Search for the character
        int index = findCharacterIndex(inputString, searchChar);

        // Output the result
        if (index != -1) {
            int search= index+1;
            System.out.println(searchChar + " is found in string at index: " + search);
        } else {
            System.out.println(searchChar + " is not found in the string.");
        }
    }

    // Function to find the index of a character in a given string
    private static int findCharacterIndex(String inputString, char searchChar) {
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == searchChar) {
                return i;
            }
        }
        // If character is not found, return -1
        return -1;
    }
}
