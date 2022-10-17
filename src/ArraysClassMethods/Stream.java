package ArraysClassMethods;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream {
    public static void main(String[] args) {
        // Creating an integer array
        int arr[] = { 1, 2, 3, 4, 5 };

        // Using Arrays.stream() to convert
        // array into Stream
        IntStream stream = Arrays.stream(arr);

        // Displaying elements in Stream
        stream.forEach(str -> System.out.print(str + " "));


    }
}
