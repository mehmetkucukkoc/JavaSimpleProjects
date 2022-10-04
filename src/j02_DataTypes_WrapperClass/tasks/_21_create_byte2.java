package j02_DataTypes_WrapperClass.tasks;
import java.util.Scanner;
public class _21_create_byte2 {

    public static void main(String[] args) {

    /*    Değeri -4 olan bir byte oluşturun.
          Bu byte'ı yazdırın.   */

        //Kodu aşağıya yazınız.
        byte b=-4;
        System.out.println(b);
Scanner girdi = new Scanner(System.in);
System.out.println("Lütfen Bir Sayı Giriniz: ");
int yas =girdi.nextInt();
System.out.println("Sayı " + yas);

Scanner girdi1 = new Scanner(System.in);
System.out.println("Lütfen ilk sayıyı giriniz: ");
int a1 =girdi1.nextInt();
System.out.println("Lütfen ikinci sayıyı giriniz: ");
int a2 = girdi1.nextInt();
 int a3=a1*a2;
        System.out.println("Sonuç: " + a3);




    }
}
