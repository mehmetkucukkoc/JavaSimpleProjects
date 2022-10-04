package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

		cevirici();
	}

	private static void cevirici() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Saat Değeri Giriniz.");
		int saat=scan.nextInt();
		int saniye=saat*3600;
		System.out.println("Bir Mil Değeri Giriniz.");
		double mil=scan.nextInt();
		double km=mil*1.6;
		System.out.println("Bir Kilogram Değeri Giriniz.");
		double kg=scan.nextInt();
		double gram=kg*1000;
		System.out.println(saat+" saat "+ saniye+" saniye eder.");
		System.out.println(mil+" mil "+ km+" km eder.");
		System.out.println(kg+" kg "+ gram+" gram eder.");

	}

}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


