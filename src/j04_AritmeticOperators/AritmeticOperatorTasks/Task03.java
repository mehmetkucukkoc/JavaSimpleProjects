package j04_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		/* Soru 10:
		 * Kullanicinin girdigi 3 basamakli sayinin ilk ve son rakamlarinin toplamini veren programi yaziniz.
		 */
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen Üç Basamaklı Bir Sayı Giriniz : ");
		int num= scan.nextInt();
		int x =num/100;
		int y =num%10;
		System.out.println(x+y);


	}

}
