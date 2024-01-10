package stringtointeger;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number as a string: ");
        String inputString = sc.nextLine();

        try {
            int number = Integer.parseInt(inputString);
            System.out.println("Output Integer: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid number as a string.");
        }

        sc.close();
    }
}
