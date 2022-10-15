package ArraysClassMethods;
import java.util.Arrays;
public class CopyOfRange {
    public static void main(String[] args) {
        int arr[] = { 12, 13, 14, 15, 16, 17, 18 };

        // to index is within the range
        int[] copy = Arrays.copyOfRange(arr, 2, 6);
        for (int i : copy)
            System.out.print(i + "  ");

        System.out.println();
        // to index is out of range
        // It assigns Zero to all the index out of range
        int[] copy1 = Arrays.copyOfRange(arr, 4, arr.length + 3);

        for (int i : copy1)
            System.out.print(i + "  ");

        // It throws IllegalArgumentException
        // int[] copy2 = Arrays.copyOfRange(arr, 5, 3);

        // It throws ArrayIndexOutOfBoundsException
        // int[] copy2 = Arrays.copyOfRange(arr, 10, arr.length + 5);
    }
}
