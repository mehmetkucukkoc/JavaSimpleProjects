package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C02_TypeCasting {
    public static void main(String[] args) {
       //boolean basarılı = true;
       //boolean basarı=basarılı;
       //System.out.println("basarılı =" basarılı);
       //System.out.println("basarı =" basarı);

int sayi1=33;
int sayi2=7;
System.out.println(sayi1/sayi2);
byte b=127;
int i=b;
        System.out.println(i);
        int num=1453;
        double d1=17;
        System.out.println("d1 = " + d1);
        double db=d1/num;
        System.out.println("db = " + db);


        double d2=14.53;
        int num2= (int) d2;
        System.out.println("num2 = " + num2);

        int num3=150;
        byte b1= (byte) num3;
        System.out.println("b1 = " + b1);

        double d3=333;
        long l= (long) d3;
        System.out.println("l = " + l);

        double d4=571.9444;
        long l2= (long) d4;
        System.out.println("l2 = " + l2);

        Scanner sc =new Scanner(System.in);
        System.out.println("Lütfen Karakter Giriniz = ");
        char ch=sc.nextLine().charAt(0);
        int asci=ch;
        System.out.println("asci = " + asci);


    }
}
