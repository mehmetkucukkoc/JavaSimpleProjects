package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class SalyangozArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç Odalı Dizi İstiyorsunuz");
        int dizi[]= new int[sc.nextInt()];
        for (int i = 0; i < dizi.length; i++){
            dizi[i]+=i+1;
        }
        System.out.println((Arrays.toString(dizi)));

    }
}
