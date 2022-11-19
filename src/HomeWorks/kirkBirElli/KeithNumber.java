package HomeWorks.kirkBirElli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KeithNumber {
    static Scanner sc = new Scanner(System.in);

   static int sayi = sc.nextInt();
    public static void main(String[] args) {

        isKeithNumber(sayi);
    }
    private static void isKeithNumber(int sayi) {
        List<Integer> liste = new ArrayList();
        int temp = sayi;
        int digit = 0;
        int toplam=0;

        while (temp > 0) {
            liste.add(temp % 10);
            temp /= 10;
            digit++;

        }
        Collections.reverse(liste);
        deneme(liste);




    }
static void deneme(List<Integer> liste){
        int toplam=0;
    int i=liste.size();
    while (i > 0) {
        toplam += liste.get(i - 1);
        i--;


    }
    liste.add(toplam);
    if(sayi==toplam) {
        System.out.println("Keith Number");
        return;
    }


    liste.remove(0);
    deneme(liste);


}
}
