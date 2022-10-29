package Deneme;

import java.util.Scanner;

public class AnaSinif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Kayit kayit1= new Kayit();
        String isim=scan.nextLine();
        kayit1.setIsim(isim);
        System.out.println(kayit1.getIsim());

    }
}
