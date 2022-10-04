package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("birinci sayıyı giriniz : ");
        double sayi1 = sc.nextDouble();
        System.out.println("ikinci sayıyı giriniz : ");
        double sayi2 = sc.nextDouble();
        System.out.println("+ için 1 \n- için 2 \n* için 3\n/için 4 seçiniz");
        int secim = sc.nextInt();
        if(secim==1){
            System.out.println(sayi1+sayi2);
        }else if(secim==2){
            System.out.println(sayi1-sayi2);}
        else if(secim==3){
            System.out.println(sayi1*sayi2);}
        if(secim==4){
            System.out.println(sayi1/sayi2);}
        else             System.out.println("1 ile 4 arası sayı seçiniz");



}
}
