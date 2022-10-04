package j03_ScannerClass_TypeCasting.tasks;
import java.util.Scanner;
public class j03_tasks {
    public static void main(String[] args) {
       //TASK01
         /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
       /* Scanner scan1 = new Scanner(System.in);
        Scanner scan2= new Scanner(System.in);
        Scanner scan3= new Scanner(System.in);
        System.out.println("Lütfen ara sınav notunuz giriniz : ");
        int not1 = scan1.nextInt();
        System.out.println("Lütfen final sınav notunuz giriniz : ");
        int not2 = scan2.nextInt();
        System.out.println("Lütfen proje sınav notunuz giriniz : ");
        int not3 =scan3.nextInt();
        System.out.println("Not Ortalamanız : "+(not3*0.2+not2*0.5+not1*0.3));
*/
        //TASK02
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *

        Scanner scan04 = new Scanner(System.in);
        Scanner scan05 = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu cm olarak giriniz.");
        double boy = scan04.nextDouble();
        System.out.println("Lütfen kilonuzu kg olarak giriniz.");
        double kilo = scan05.nextDouble();
        double BKE = kilo/((boy/100)*(boy/100));
        System.out.println("BKE'niz = "+BKE);
        System.out.println("BKE'niz = "+(int) BKE);
*/
        //TASK03
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor

        Scanner scan06=new Scanner(System.in);
        System.out.println("Günde Kaç Saat Uyuyorsunuz");
        int uykuSaati = scan06.nextInt();
        System.out.println("Bir ayda uykuda geçe saatiniz : "+uykuSaati*30);
        System.out.println("Bir yılda uykuda geçe saatiniz : "+uykuSaati*365);
        System.out.println("Kırk yılda uykuda geçe saatiniz : "+uykuSaati*365*40);
         */
        //TASK04
         /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.

        Scanner scan07 = new Scanner(System.in);
        System.out.println("Lüffen İsminizi Giriniz : ");
        String isim = scan07.nextLine();
        System.out.println("Lüffen Soyisminizi Giriniz : ");
        String soyisim = scan07.nextLine();
        System.out.println("Lüffen Yaşınızı Giriniz : ");
        int yas = scan07.nextInt();
        System.out.println("Lüffen Boyunuz Giriniz : ");
        int kilo = scan07.nextInt();
        System.out.println("Salona Kaç Ay Devam Edeceksiniz : ");
        int süre = scan07.nextInt();
        System.out.println("Ödemeniz Gereken Tutar : "+süre*20 +"$");

          */
        //TASK06
         /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13

*/
        /*
        Scanner scan08=new Scanner(System.in);
        System.out.println("Lütfen 1. Kenarın Uzunluğunu Giriniz : ");
        int kenar1= scan08.nextInt();
        System.out.println("Lütfen 2. Kenarın Uzunluğunu Giriniz : ");
        int kenar2= scan08.nextInt();
        double hipo = Math.sqrt(kenar1*kenar1+kenar2*kenar2);
        System.out.println("Hipotenüs Uzunluğu : "+ hipo);

         */

        //TASK07
         /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.

        Scanner scan09 = new Scanner(System.in);
        System.out.println("Lütfen Şehirler Arası Uzaklığı Giriniz :");
        double mesafe = scan09.nextDouble();
        System.out.println("Lütfen Ortalama Hızınızı Giriniz :");
        double hiz = scan09.nextDouble();
        double sure =mesafe/hiz;
        System.out.println("Varış Süreniz :"+ sure);
*/
        //TASK08
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz


        Scanner scan10 = new Scanner(System.in);
        System.out.println("Lütfen 1. Vize Notunuzu Giriniz.");
        double vize1=scan10.nextDouble();
        System.out.println("Lütfen 2. Vize Notunuzu Giriniz.");
        double vize2=scan10.nextDouble();
        System.out.println("Lütfen Final Notunuzu Giriniz.");
        double finalnotu = scan10.nextDouble();
        double gecmenotu = ((vize1/2+vize2/2)*0.3 + finalnotu*0.7);
        System.out.println("Geçme Notunuz : "+gecmenotu);

 */
        //TASK09
         /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333

        Scanner scan11 =new Scanner(System.in);
        System.out.println("A sayısını Giriniz");
        double a=scan11.nextDouble();
        System.out.println("B sayısını Giriniz");
        double b=scan11.nextDouble();
        System.out.println("C sayısını Giriniz");
        double c=scan11.nextDouble();
        double sonuc = ((a*a-b*b)/3*c);
        System.out.println("Sonuc " + sonuc);
 */
        //TASK10
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9
/*
        Scanner scan12 = new Scanner(System.in);
        System.out.println("Lütfen Bir Fahrenheit Değeri Giriniz.");
        double f = scan12.nextDouble();
        double c = (f-32)*5/9;
        System.out.println("Celcius "+c);

 */






    }
}
