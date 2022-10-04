package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		/* Soru 5:
		 * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
		 */
		
Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayı Giriniz");
		double sayi = scan.nextDouble();
		double sonuc = (sayi/60*10+20)-40;
		System.out.println(sonuc);

	}

}
