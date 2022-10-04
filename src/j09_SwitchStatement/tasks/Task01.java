package j09_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz.");
        int sayi = sc.nextInt();
        int onlarBas = (sayi / 10) % 10;
        onlarBas = Math.abs(onlarBas);
        switch (onlarBas) {
            case 0:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 0'dır");
                break;
            case 1:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 1'dir");
                break;
            case 2:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 2'dir");
                break;
            case 3:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 3'tür");
                break;
            case 4:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 4'tür");
                break;
            case 5:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 5'dir");
                break;
            case 6:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 6'dır");
                break;
            case 7:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 7'dir");
                break;
            case 8:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 8'dir");
                break;
            case 9:
                System.out.println("Girdiğiniz Sayının 10'lar Basamağı : 9'dur");
                break;
        }


    }
}
