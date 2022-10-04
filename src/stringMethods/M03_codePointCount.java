package stringMethods;

import java.util.Scanner;

public class M03_codePointCount {
    public static void main(String[] args) {
        //codePointCount() bir dizenin belirtilen metin aralığındaki unicode döndürür.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen String Bir İfade Giriniz");
       String ifade = scan.nextLine();
       // System.out.println("Girdiğiniz İfadede ASCI değerini bulmak istediğiniz Karakterin index değerini giriniz.");
        //int index = scan.nextInt();
        System.out.println(ifade.codePointCount(0,4));

    }
}
