package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Girmek İstediğiniz Sayı Adedini Yazınız");
        int arr[]= new int[sc.nextInt()];
        int sayac=0;
        for (int i = 0; i <arr.length; i++){
            System.out.println("Lütfen "+i+". İndeksi Giriniz");
            arr[i]=sc.nextInt();
            if(arr[i]%3==0) sayac++;
        }
        System.out.println("sayac = " + sayac);
        System.out.println(Arrays.toString(arr));

    }

}
