package HomeWorks.birOn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions09 {
     /*

   Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı
   yüksek olduğundan hata kontrolü zorunlu tutuluyor.
   bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor.
   bu gibi surumlara karşılk gelen hatalara Checked Exception denir
   Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


   Bir kod yazilirken olasi exception'lar ongorulup
   exception olustugunda Java'nin ne yapmasini istedigimiz
   belirtilmelidir.

   1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma
   ile ilgili problemlerde  kullanilir. Bir dosyaya ulasmada iki
   temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.
    2) IOException, input ve output ile alakali tum problemlerde kullanilir.
    IOException,FileNotFoundException'in yaptigi tum aksiyonları yapabilir
    dolayısıyla IOException kullanildiginda FileNotException'in kullanilmasina gerek yoktur.
     IOException FileNotFoundException
     Class'inin parent class
         */
     public static void main(String[] args) throws IOException {
  try{       FileInputStream fis= new FileInputStream("C:/Users/Mehmet/IdeaProjects/javaLearn/src/HomeWorks/birOn/readMe");
         //ilgili dosyaya ulaşmak için fis obj tanımlandı parametre
         // olarak ulaşılacak dosya yolu(path) girildi
         //FileNotFoundException-> adres yanlışşsa controlu

        /*
        Eğer bir method'da Checked (CTE riski olan excp.) exception varsa method
        signature(mnethod name'den sonraki bölüm) hata uyarısı altı kırmızı çizgi verir
        komutun derlenmesine izin vermez ve kod üzerine gelidiğimde Add...
        exception handle etme tavsiye eder otamatih throws excp eklenir.
        Bu şekilde methodu call eden komutlat try-catch alınması garanti edilmiş olur.
         */
     int k;
     try {
         while ((k = fis.read()) != -1) {//IOException -> evde yoksa controlu
             System.out.print((char) k);//k int  ascci olan file değeri char ici
             // casting-> type dönüşümü

         }
         System.out.println();
         System.out.println("*****Dosya Okundu*****");
     }catch(IOException e) {//dosyaya ulaşılır fakat okunamzsa bu catch çalışır
         System.out.println("***Dosya Okunamadı***");
     }
     }catch//dosyaya ulaşılmazza bu catch çalışır
     (FileNotFoundException e) {
         System.out.println("Dosya'ya Ulaşılamadı");
     }

















     }
}
