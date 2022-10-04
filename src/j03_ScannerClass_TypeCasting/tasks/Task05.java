package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
Scanner scan08 = new Scanner(System.in);
		System.out.println("Lütfen 1. sayıyı giriniz.");
		int sayi1 =scan08.nextInt();
		System.out.println("Lütfen 2. sayıyı giriniz.");
		int sayi2 =scan08.nextInt();
		System.out.println("Çarpma " + sayi1*sayi2 +" Bölme "+sayi1/sayi2+" Toplama "+(sayi2+sayi1)+" Çıkarma "+(sayi1-sayi2));



	}

}
