import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        long number = scanner.nextLong();
        
        long reversedNumber = 0;
        boolean isNegative = number < 0;

        // Make the number positive for reversal
        number = Math.abs(number);

        while (number != 0) {
            long digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        if (isNegative) {
            reversedNumber *= -1;
        }

        System.out.println("Reverse Number: " + reversedNumber);

        scanner.close();
    }
}
