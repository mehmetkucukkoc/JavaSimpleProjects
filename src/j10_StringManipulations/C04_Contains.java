package j10_StringManipulations;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {

       /*
       string içerisinde istenen stringin varlığını kontrol eder boolean return eder

        String s1="Enise Hanım başarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım"));
        System.out.println(s1.contains("e"));
        System.out.println(s1.contains(" "));

        String s2="Qa";
        System.out.println(s1.contains(s2));
        System.out.println(s2.contains(s1));

        */
        //task--> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz. ternary kullanınız.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Bir Cümle Giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lütfen Cümlede Aramak İstediğiniz İfadeyi Giriniz");
        String arananIfade = scan.nextLine();
        System.out.println((cumle.contains(arananIfade) ? "İçeriyor" : "İçermiyor"));

    }
}
