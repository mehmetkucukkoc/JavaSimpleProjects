package ScannerClass;

import java.util.Scanner;

public class DeLimiter {
    public static void main(String[] args) {
        String s = "Geeksforgeeks has Scanner Class Methods";

        // create a new scanner
        // with the specified String Object
        Scanner scanner = new Scanner(s);

        // prints the next line of the string
        System.out.println("Scanner String: \n"
                + scanner.nextLine());

        // print the delimiter this scanner is using
        System.out.println("\nDelimiter being used in Scanner: "
                + scanner.delimiter());

        // Close the scanner
        scanner.close();
    }
}
