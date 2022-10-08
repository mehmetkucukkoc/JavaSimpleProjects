package Projects;

import java.util.Scanner;

public class ForLoop_Ex01 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen Bir Sayı Giriniz");
        long sayi=scan.nextLong();
        int bolenSayisi=0;
       for(int i=1;i<=sayi;i++){
          if(sayi%i==0){

              bolenSayisi++;

          }
       }System.out.println(bolenSayisi);


    }
}
