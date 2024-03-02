import java.util.Scanner;

public class DataTypeConversion {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Take input from user
    System.out.print("Enter an integer value: ");
    int intVal = sc.nextInt();

    // Implicit conversion - widening
    long longVal = intVal; 
    float floatVal = longVal;
    double doubleVal = floatVal;

    System.out.println("Widening:");
    System.out.println(intVal);
    System.out.println(longVal);
    System.out.println(floatVal);
    System.out.println(doubleVal);

    // Explicit conversion - narrowing
    double doubleVal2 = 100.12345;
    float floatVal2 = (float)doubleVal2;
    long longVal2 = (long)floatVal2; 
    int intVal2 = (int)longVal2;

    System.out.println("Narrowing:"); 
    System.out.println(doubleVal2);
    System.out.println(floatVal2);
    System.out.println(longVal2);
    System.out.println(intVal2);

    // Overflow
    int intMax = Integer.MAX_VALUE;
    int overflow = intMax + 1; 

    System.out.println("Overflow:");
    System.out.println(intMax);
    System.out.println(overflow);

    // Underflow
    int intMin = Integer.MIN_VALUE; 
    int underflow = intMin - 1;

    System.out.println("Underflow:");
    System.out.println(intMin);
    System.out.println(underflow);
    
    sc.close();
  }

}