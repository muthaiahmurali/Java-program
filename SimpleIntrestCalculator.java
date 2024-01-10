import java.util.Scanner;
public class SimpleIntrestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Time period (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Is the customer a senior citizen? (y/n): ");
        boolean isSeniorCitizen = scanner.nextBoolean();

        double interestRate = isSeniorCitizen ? 0.12 : 0.10;

        double simpleInterest = principal * interestRate * time;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}