package HomeWorks.yirmiBirOtuz;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        int sayi= scan.nextInt();
        System.out.println(getFactorial(sayi));
    }

    private static int getFactorial(int sayi) {
      if(sayi==0){
          return 1;

      }else return sayi*getFactorial(sayi-1);
    }

}
