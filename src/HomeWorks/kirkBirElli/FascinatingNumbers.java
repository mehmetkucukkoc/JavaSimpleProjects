package HomeWorks.kirkBirElli;

import java.util.*;

public class FascinatingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi = sc.nextInt();
        System.out.println(isFascinatingNumber(sayi) ? "Fascinating Number" : "Not Fascinating Number");
    }

    private static boolean isFascinatingNumber(int sayi) {
        int counter = 0;
        int sayi2 = sayi * 2;
        int sayi3 = sayi * 3;
        String sum = "" + sayi + sayi2 + sayi3;
        // int sum2=Integer.parseInt(sum);

        List<Integer> liste = new ArrayList();
        for (int i = 0; i < sum.length(); i++) {
            if (Integer.parseInt(String.valueOf(sum.charAt(i))) != 0) {
                liste.add(Integer.parseInt(String.valueOf(sum.charAt(i))));
            }
        }
        Collections.sort(liste);
        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) == i + 1) {
                counter++;
            }
        }
        if (counter == 9) {
            return true;
        }
        return false;
    }
}
