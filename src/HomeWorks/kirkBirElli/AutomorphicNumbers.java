package HomeWorks.kirkBirElli;

import java.util.Scanner;

public class AutomorphicNumbers {

  static  boolean isAutomorphic(int number){
      int square=number*number;
      while(number>0){
          if(square%10!=number%10){
              return false;
          }
          number/=10;
          square/=10;
      }return true;

  }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz");
        System.out.println(isAutomorphic(scan.nextInt())?"Sayı Automorphic":"Automorphic Değil");
    }
}