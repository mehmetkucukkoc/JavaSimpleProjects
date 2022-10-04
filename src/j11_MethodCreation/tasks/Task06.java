package j11_MethodCreation.tasks;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		hesapla();
	}

	public static void hesapla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Alanını ve Çevresini Hesaplamak İstediğniz Şekil \nÜçgen ise U'ya \nDikdörtgen ise D'ye \nParalelkenar ise P'ye Basınız.");
		char ch=scan.next().toUpperCase().trim().charAt(0);
		System.out.println("Lütfen Seçtiğiniz Şeklin 1. Kenar Uzunluğunu Giriniz");
		double birinciKenar=scan.nextDouble();
		System.out.println("Lütfen Seçtiğiniz Şeklin 2. Kenar Uzunluğunu Giriniz :");
		double ikinciKenar=scan.nextDouble();
		switch(ch){
			case 'U':
				System.out.println("Üçgenin Alanı "+ (birinciKenar*ikinciKenar/2));
				System.out.println("Üçgenin Çevresi "+ (birinciKenar*3));
				break;
			case 'D':
				System.out.println("Dikdörtgenin Alanı "+ (birinciKenar*ikinciKenar));
				System.out.println("Dikdörtgenin Çevresi "+ ((birinciKenar+ikinciKenar)*2));
				break;
			case 'P':
				System.out.println("Paralelkenarın Alanı "+ (birinciKenar*ikinciKenar));
				System.out.println("Paralelkenarın Alanı "+ (birinciKenar+ikinciKenar)*2);
				break;
			default:
				System.out.println("Yanlış Değer Girdiniz");
		}
	}
}