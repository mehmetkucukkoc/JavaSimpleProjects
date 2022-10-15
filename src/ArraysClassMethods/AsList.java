package ArraysClassMethods;

import java.util.List;
import java.util.Arrays;

public class AsList {
    public static void main(String[] args) {
        String a[] = new String[] { "A", "B", "C", "D" };
        String b[]={"1","2","3","4"};

        // Getting the list view of Array
        List<String> list = Arrays.asList(a);
        List<String> list2 = Arrays.asList(b);

        // Printing all the elements in list object
        System.out.println("The list is: " + list);
        System.out.println("The list is: " + list2);
    }
}
