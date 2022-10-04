package j02_DataTypes_WrapperClass;

import javax.sound.midi.Soundbank;

public class C03_Concatenation {
    public static void main(String[] args) {
        String ad ="Mehmet";
        String soyad ="Küçükkoç";
        int a=7;
        int b=11;
        //birden çok string variable ile farklı data variablelar + ile işleme alınırsa
        // java birleştirme yaparak yeni bir string oluşturur
        System.out.println(ad+soyad+a+b);
        System.out.println(a+ad+soyad+b);
        System.out.println(a+b+ad+soyad);
        System.out.println("  "+a+b);
        System.out.println(ad+soyad+(a+b));
        System.out.println((a+b)+ad+soyad);
        System.out.println(ad+(a-b)+(a-b));

        char ch='1';
        System.out.println(ad+ch);
        System.out.println(a+ch+ad);
        System.out.println(ad+(ch+b));
        System.out.println(a+ad+ch);
        //TRICK char data türü işleme girdiği variable ın türüne göre farklı işlem yapar
        // eğer aritmetik işleme girerse asci deeğeri alır string olursa karakter değeri alır.
        /* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
 */
        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
// işlem yapılıp String variable'a Concatenation yapılır.

//1. yöntem
        int s3=19;
        int s4=86;
        int degisim;
        System.out.println("s3 sayısının ilk değeri : "+s3+ " s4 sayısının ilk değeri : "+s4);
        degisim =s3;
        s3=s4;
        s4=degisim;
        System.out.println("s3 sayısının son değeri : "+s3+ " s4 sayısının son değeri : "+s4);
        //2. yöntem
        int s1 =19;
        int s2 =86;
        System.out.println("s1 sayısının ilk değeri : "+s1+ " s2 sayısının ilk değeri : "+s2);
        System.out.println("s1 sayısının son değeri : "+s2+ " s2 sayısının son değeri : "+s1);


    }
}
