import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number to be printed:");
        int num = scanner.nextInt();
        System.out.println("Max number of times printed:");
        int maxTimes = scanner.nextInt();

        // Print the pattern
        for (int i = 1; i <= maxTimes * 2 - 1; i++) {
            int times = i <= maxTimes ? i : maxTimes * 2 - i;
            for (int j = 1; j <= times; j++) {
                System.out.print(num);
            }
            System.out.println();
        }

        scanner.close();
    }
}
