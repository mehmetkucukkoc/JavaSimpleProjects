package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz.");
        int x = scan.nextInt();
        System.out.println("Lütfen 2. sayıyı giriniz.");
        int y = scan.nextInt();
        System.out.println("Lütfen 3. sayıyı giriniz.");
        int z = scan.nextInt();
        hesapla(x, y, z);

    }

    public static void hesapla(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("en küçük " + a);

        } else if (b < a && b < c) {
            System.out.println("en küçük " + b);

        } else System.out.println("en küçük " + c);
    }
}

