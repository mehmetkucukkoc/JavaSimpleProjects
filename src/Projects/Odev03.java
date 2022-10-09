package Projects;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz : ");
        int sayi = sc.nextInt();
        asalMi(sayi);

    }

    public static int asalMi(int sayi) {
        int counter = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                counter++;
            }


        }
        if (counter > 2) {
            System.out.println("Sayınız Asal Sayı Değildir");

        } else System.out.println("Sayınız Asal Sayıdır");
        return counter;
    }
}