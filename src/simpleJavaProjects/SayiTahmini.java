package simpleJavaProjects;
import java.util.Scanner;
import java.util.Random;

public class SayiTahmini {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Bir Tahminde Bulunun");
        int tahmin =sc.nextInt();
        Random r =new Random();
        int sayi=r.nextInt(101);
        while(tahmin!=sayi){
            if(tahmin<0||tahmin>100){
                System.out.println("Lütfen 1 ile 100 arasında bir sayı Giriniz");
                tahmin= sc.nextInt();
            } else if (tahmin<sayi) {
                System.out.println("Lütfen Büyük Bir Sayı Giriniz.");
                tahmin=sc.nextInt();
            }else {
                System.out.println("Lütfen Küçük Bir Sayı Giriniz.");
                tahmin=sc.nextInt();
            }

            }
        System.out.println("Doğru Tahmin");
    }

}

