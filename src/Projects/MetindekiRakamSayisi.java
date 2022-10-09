package Projects;

import java.util.Scanner;

public class MetindekiRakamSayisi {
    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Metin Giriniz : ");
        String s = scan.nextLine();
        int counter = 0;

        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) >= 0 && s.charAt(i) <= 9) {
                counter++;
            } else System.out.println("Girdiğiniz Metinde Rakam Bulunmamaktadır");
        }
        System.out.println(counter);
    }
}
