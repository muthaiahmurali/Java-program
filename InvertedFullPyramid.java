import java.util.Scanner;

public class InvertedFullPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the inverted full pyramid:");
        int rows = scanner.nextInt();

        // Printing the inverted full pyramid
        for (int i = rows; i >= 1; i--) {
            // Print spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print '*'
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
