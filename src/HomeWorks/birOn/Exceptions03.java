package HomeWorks.birOn;

import java.util.Scanner;

public class Exceptions03 {
    public static void main(String[] args) {
        /*IllegalargumentException -> kullanılmasını istenmeyen değerlerde pr
        hata vermesi isteniyorsa bu excp fırlatılıer
        ornek : yas datası için negatif değer girilidğinde pr kırılmadan run olması
        ama girile değer için excp fırlatması için kullanılır..
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Ehliyet almak için yaşınızı giriniz");
        int age = scan.nextInt();
        // if (age<18){
        //     System.out.println("yasınız : "+age+" ehliyet için uygun değil ");
        //     throw new IllegalArgumentException();//throw komutu try-catch block
        //     olmadan da istenen method body'de tanımlanabilir.
        // }
        // else System.out.println("yasınız : "+age+" ehliyet için uygun");
        try {
            if (age < 18) {
                throw new IllegalArgumentException("Yaşınız " + age + " olduğu için ehliyet alamazsınz");
                //throw keyword ile Excp obj olusturularak hata tanımlanır ve fırlatırlır
                // böylece sartımıza uymayan  değer için de catch block'a
                // düşürerek daha pratik code yazıldı
                //  System.out.println("ehliyete basvurman için daha  : " + (18 - age) + "yıl var ...");
            }else System.out.println("yasınız : "+age+" ehliyet için uygun");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("ehliyete basvurman için daha  : " + (18 - age) + "yıl var ...");
        }
        System.out.println(" sorun handle edildi");
        //bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}
