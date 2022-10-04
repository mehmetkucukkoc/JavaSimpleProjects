package j10_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {


        String str="Good";
        System.out.println(str.indexOf('o'));
        System.out.println(str.indexOf("d"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("od"));
        System.out.println(str.indexOf("Od"));

        String isim ="mustafa nizamoğlu";
        System.out.println(isim.indexOf("a"));
        System.out.println(isim.lastIndexOf("a"));
        System.out.println(isim.lastIndexOf("fa"));

        /*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Uzun Bir Cümle Giriniz.");
        String cumle=sc.nextLine();



    }
}
