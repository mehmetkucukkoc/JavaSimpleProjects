package allLessons;

import java.util.Scanner;

public class Lesson001 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int first, second, third, fourth, fifth;
        System.out.println("Lütfen birinci sayıyı giriniz.");
        first=sc.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz.");
        second=sc.nextInt();
        System.out.println("Lütfen üçüncü sayıyı giriniz.");
        third=sc.nextInt();
        System.out.println("Lütfen dördüncü sayıyı giriniz.");
        fourth=sc.nextInt();
        System.out.println("Lütfen beşinci sayıyı giriniz.");
        fifth=sc.nextInt();
        System.out.println("Sonuc : "+(first/second*third+fourth-fifth));
    }
}
