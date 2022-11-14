package HomeWorks.onBirYirmi;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayKarakterSayimi_01 {
    /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
    public static void main(String[] args) {

//*********** 1. çözüm********************
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for (int i = 0; i < str.length(); i++) {
            int counter = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            System.out.print(str.charAt(i) + " ==> " + counter + " ");

        }
        System.out.println();
        //*********** 2. çözüm********************
        String arr[] = str.split("");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //count :sayac olustur
        int counter = 0;
        //karakterleri karsilastirmak icin for loop
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].equals(arr[i])) { //birden fazla sayidaki karakter icin
                counter++;
            } else { //tek sayidaki karakter
                System.out.println(arr[i - 1] + " sayisi " + (counter + 1));
                counter = 0;
            }
            if (i == arr.length - 1) {//en son karakter benzersiz ise calisir
                System.out.println(arr[i] + " sayisi " + (counter + 1));
            }
        }
    }
}