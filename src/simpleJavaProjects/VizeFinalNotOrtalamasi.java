package simpleJavaProjects;

import java.util.Scanner;

public class VizeFinalNotOrtalamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz.");
        double vize = scan.nextDouble();
        System.out.println("Final notunuzu giriniz.");
        double finall = scan.nextDouble();
        double sonuc = vize * 0.4 + finall * 0.6;
        System.out.println("Notunuz : " + sonuc);
        if (sonuc >= 50) {
            System.out.println("Geçtiniz Tebrikler");

        }
        else System.out.println("Kaldınız Üzgünüz.");


    }
}
