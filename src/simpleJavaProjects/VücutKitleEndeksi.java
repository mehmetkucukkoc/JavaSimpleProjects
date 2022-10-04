package simpleJavaProjects;

import java.util.Scanner;

public class VücutKitleEndeksi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz. (Örnek 80)");
        double kilo = scan.nextDouble();
        System.out.println("Boyunuzu Giriniz. (Örnek 1,80)");
        double boy=scan.nextDouble();
        double VKE=(kilo/(boy*boy));
        System.out.println("Vücut Kitle Endeksiniz : "+VKE);


    }
}
