package HomeWorks.yirmiBirOtuz;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç Tane Fibonacci Sayısı Bulmak İstiyorsunuz");
        int count = scanner.nextInt();
        System.out.print(sayi1+" "+sayi2);
        fibonacci(count-2);


    }

   static int sayi1 = 0;
   static int sayi2 = 1;
   static int sayi3 = 0;

    private static void fibonacci(int count) {
        while(count > 0) {
            sayi3=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=sayi3;
            System.out.print(" "+sayi3);
            count--;
        }





    }

}
