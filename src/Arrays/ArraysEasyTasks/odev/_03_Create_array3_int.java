package Arrays.ArraysEasyTasks.odev;

import java.util.stream.IntStream;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
        int arr[] = {25, 30, 30, 35, 100};
        int sum = IntStream.of(arr).sum();
        System.out.println("The sum is " + sum);
        int toplam = 0;
        for (int i = 0; i < arr.length; i++)
        {
            toplam += arr[i];
        }
        System.out.println("toplam = " + toplam);
    }
}