import java.util.Scanner;

public class MatrixOperationChooser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for the matrices:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of columns for the matrices:");
        int columns = scanner.nextInt();

        int[][] matrixA = new int[rows][columns];
        int[][] matrixB = new int[rows][columns];
        int[][] resultMatrix = new int[rows][columns];

        System.out.println("Enter elements for matrix A:");
        fillMatrix(matrixA, scanner);

        System.out.println("Enter elements for matrix B:");
        fillMatrix(matrixB, scanner);

        System.out.println("Choose the operation:");
        System.out.println("1. Matrix Addition");
        System.out.println("2. Matrix Multiplication");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                resultMatrix = addMatrices(matrixA, matrixB);
                System.out.println("Result of Matrix Addition:");
            }
            case 2 -> {
                resultMatrix = multiplyMatrices(matrixA, matrixB);
                System.out.println("Result of Matrix Multiplication:");
            }
            default -> {
                System.out.println("Invalid choice");
                return;
            }
        }

        printMatrix(resultMatrix);

        scanner.close();
    }

    // Method to fill a matrix with user input
    public static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;
        int[][] result = new int[rowsA][columnsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsB; j++) {
                for (int k = 0; k < columnsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
