package A.Practices;

import java.util.ArrayList;
import java.util.List;

public class Pr_16 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        sumOfConsecutiveNumbers();
    }

    private static void sumOfConsecutiveNumbers() {
        List<Integer> numberList = new ArrayList<>(List.of(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        List<Integer> numberList2 = new ArrayList<>();

        System.out.println("numberList = " + numberList);
        for (int i = 0; i < numberList.size(); i++) {
            if (i == 0) {
                numberList2.add(numberList.get(i));
            }
            if (i == 1) {

                numberList2.add(numberList.get(i) + numberList.get(i + 1));
            }
            if (i == 3) {

                numberList2.add(numberList.get(i) + numberList.get(i + 1) + numberList.get(i + 2));
            }
            if (i == 6) {

                numberList2.add(numberList.get(i) + numberList.get(i + 1) + numberList.get(i + 2) + numberList.get(i + 3));
            }
        }
        System.out.println("numberList2 = " + numberList2);
    }
}

