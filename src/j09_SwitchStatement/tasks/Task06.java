package j09_SwitchStatement.tasks;


import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
		Scanner scanner = new Scanner(System.in);
		System.out.println("VIP acilimini ogrenmek istediginiz harfi tuslayiniz");
		char girdi = scanner.next().toLowerCase().charAt(0);

		switch(girdi) {
			case 'v': System.out.println("Very");break;
			case 'i':System.out.println("Important");break;
			case 'p':System.out.println("Person");break;
			default: System.out.println("Yanlis giris yaptiniz");}}}






