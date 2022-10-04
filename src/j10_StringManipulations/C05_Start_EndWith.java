package j10_StringManipulations;

import java.util.Scanner;

public class C05_Start_EndWith {
    public static void main(String[] args) {
        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        /*String sehir ="istanbul";
        System.out.println(sehir.startsWith("i"));
        System.out.println(sehir.startsWith("is"));
        System.out.println(sehir.startsWith("s"));
        System.out.println(sehir.startsWith("a",3));//3,indexten itibaren a ile mi başlar
        System.out.println(sehir.endsWith("l"));
        System.out.println(sehir.endsWith("bul"));
        System.out.println(sehir.endsWith("bu"));

        String str="bul";
        System.out.println(sehir.endsWith(str));

         */
        //task--> girilen e-mail hesabının @gmail.com içermiyorsa "lütfen gmail hesabı giriniz."
        // @gmail.com ile bitiyorsa onaylandı aksi durumda geçerli hesap giriniz print eden kd create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen geçerli bir gmail hesabı giriniz.");
        String mailHesap = scan.nextLine();
        String gmail ="@gmail.com";
        System.out.println(mailHesap.contains(gmail)?"Geçerli Mail Adresi":"Geçersiz Mail Adresi! Geçerli bir adres giriniz");

    }
}
