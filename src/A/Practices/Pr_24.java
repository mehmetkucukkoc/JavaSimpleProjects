package A.Practices;

public class Pr_24 {
    public static void main(String[] args) {
        String name = "Haluk";
        int yas = 33;

        System.out.println(name.toUpperCase());//HALUK

        // non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
        // ancak primitive data turlerinin boyle bir ozelligi yoktur
        // primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
        //Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
        // olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
        // ara çözüm imkanı sunmuştur.

        //TASK id ve tc String değerlernin toplamını print eden code yazınız
        String tc ="1234455";
        String id="98765";
        System.out.println(tc+id);//concat-> birleştirme : 123445598765

        int yeniTC=  Integer.valueOf(tc);// tc String değerini int cevirdi ve yeniTC'ye atadı
        System.out.println("yeniTC = " + yeniTC);

        int yeniId=  Integer.valueOf(id);// tc String değerini int cevirdi ve yeniId'ye atadı
        System.out.println("yeniId = " + yeniId);

        System.out.println(yeniId+yeniTC);// aritmetik toplama->1333220
        String okulNo="234543l";
        int yeniOkulNo= Integer.valueOf(okulNo);// run time Exception-> çalışma zamanı hatası
        System.out.println("yeniOkulNo = " + yeniOkulNo);
    }
}
