import java.util.Scanner;
import java.lang.Boolean;

public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        // Integer data types
        byte byteVar = 10;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 1000000000L; // Note the 'L' suffix to specify a long literal
        
        // Floating-point data types
        float floatVar = 3.14f; // Note the 'f' suffix to specify a float literal
        double doubleVar = 3.14159;
        
        // Character data type
        char charVar = 'A';
        
        // Boolean data type
        boolean booleanVar = true;
        
        // Printing out the values
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
    }
}
