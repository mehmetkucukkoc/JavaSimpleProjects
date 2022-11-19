package HomeWorks.kirkBirElli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AutobiographicalNumber {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList();
        List<Integer> counterliste = new ArrayList();
        List<Integer> rakam = new ArrayList(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        int counter = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        String str = String.valueOf(num);
        for (int i = 0; i < str.length(); i++) {
            liste.add(Integer.valueOf(String.valueOf(str.charAt(i))));

        }
        for (int i = 0; i < liste.size(); i++) {
            for (int j = 0; j < liste.size(); j++) {

                if (rakam.get(i) == liste.get(j)) {
                    counter++;
                }


            }
            counterliste.add(counter);


            counter = 0;

            {
            }

        } System.out.println((counterliste.equals(liste))?"Autobiographical Number":"Not Autobiographical Number");

    }
}