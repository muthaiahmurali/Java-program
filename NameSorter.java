package namesorter;

import java.util.*;

public class NameSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Enter names (type 'done' to finish):");
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            names.add(input);
        }

        System.out.print("Enter sorting order (A for Ascending, D for Descending): ");
        String sortOrder = scanner.nextLine().toUpperCase();

        if (sortOrder.equals("A")) {
            Collections.sort(names);
        } else if (sortOrder.equals("D")) {
            Collections.sort(names, Collections.reverseOrder());
        } else {
            System.out.println("Invalid sorting order choice.");
            return;
        }

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
