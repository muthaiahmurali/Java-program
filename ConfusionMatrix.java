import java.util.Scanner;

public class ConfusionMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input confusion matrix elements from the user
        System.out.println("Enter the Confusion Matrix Elements:");
        System.out.print("True Positives (TP): ");
        int TP = scanner.nextInt();
        System.out.print("True Negatives (TN): ");
        int TN = scanner.nextInt();
        System.out.print("False Positives (FP): ");
        int FP = scanner.nextInt();
        System.out.print("False Negatives (FN): ");
        int FN = scanner.nextInt();

        // Calculate True Positive (TP), True Negative (TN), False Positive (FP), False Negative (FN)
        double precision = (double) TP / (TP + FP);
        double recall = (double) TP / (TP + FN);
        double f1Score = 2 * (precision * recall) / (precision + recall);

        // Output the results
        System.out.println("\nResults:");
        System.out.println("True Positives (TP): " + TP);
        System.out.println("True Negatives (TN): " + TN);
        System.out.println("False Positives (FP): " + FP);
        System.out.println("False Negatives (FN): " + FN);
        System.out.println("Precision: " + precision);
        System.out.println("Recall: " + recall);
        System.out.println("F1-Score: " + f1Score);

        scanner.close();
    }
}
