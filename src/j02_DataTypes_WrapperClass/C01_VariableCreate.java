package j02_DataTypes_WrapperClass;

public class C01_VariableCreate {
    public static void main(String[] args) {

        //1. yol best practice (recommended) tavsiye edilen
        int yas=48;
        int maas=33000;
        System.out.println(yas);
        System.out.println("yas");
        System.out.println("başlangıç maaşım : "+maas);
        // 2.yol
        int boy; //değeri atanmayan boy isminde sadece decleration var assignment yok
        boy=175;
        System.out.println(boy);
        /* değeri atanmamış değişken hiç bir aksiyonda kullanılmaz.
         değeri atama initialize olarak ifade
           */
        //3.yol
        int yevmiye,age,kilo; //birden çok aynı tipte değişken tanımlandı.
        age=33;
        yevmiye=1000;
        kilo=99;//tanımlanan değişkenlere değer atandı
        int gunluk=1500, yil=2022, agirlik=99;
                // bir variable bir kez tanımlanabilir birden çok değer atanabilir.
        System.out.println(gunluk);
        gunluk=1800;//yeni değer 1800
        System.out.println(gunluk);

    }

}
