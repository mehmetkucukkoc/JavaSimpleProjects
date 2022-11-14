package HomeWorks.onBirYirmi;

import java.util.Scanner;

public class AsalSayiMi_02 {
    public static void main(String[] args) {
        /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
        Scanner scan = new Scanner(System.in);
        int sayi = scan.nextInt();
        boolean flag = true;
        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Sayı Asaldır");
            } else System.out.println("Sayı Asal Değildir");

        }else System.out.println("Sayı Asal Değildir");// 0 ve 1 icin calisan kod satiri
    }
}
